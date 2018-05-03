package ca.miadelara.game;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import ca.miadelara.game.entities.Player;
import ca.miadelara.game.gfx.Colors;
import ca.miadelara.game.gfx.Font;
import ca.miadelara.game.gfx.Screen;
import ca.miadelara.game.gfx.SpriteSheet;
import ca.miadelara.game.level.Level;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	public static final int WIDTH = 160;
	public static final int HEIGHT = WIDTH / 12 * 9;
	public static final int SCALE = 3;
	public static final String NAME = "Sophia's Adventures! ";
	
	private JFrame frame;
	
	public boolean running = false;
	public int tickCount = 0;
	
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
	private int[] colors = new int[6 * 6 * 6];
	
	private Screen screen;
	public InputHandler input;
	public Level level;
	public Player player;
	
	public Game () {
		setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		
		frame = new JFrame(NAME);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
	}
	
	public void init(){
		int index = 0;
		for (int r = 0; r < 6; r++){ //loops thru colors
			for (int g = 0; g < 6; g++){
				for (int b = 0; b < 6; b++){
					int rr = (r * 255 / 5);//gives us our shades from 0 to 5
					int gg = (g * 255 / 5);//255 is transparent color
					int bb = (b * 255 / 5);

					colors[index++] = rr << 16 | gg << 8 | bb;
				}
			}
		}
		
		screen = new Screen(WIDTH, HEIGHT, new SpriteSheet("/sprite_sheet.png"));
		input = new InputHandler(this);
		level = new Level(32, 32);
		player = new Player(level, 3, 3, input);
		level.addEntity(player);
	}
	public synchronized void start() {
		running = true;
		new Thread(this).start();
	}
	
	public synchronized void stop() {
		running = false;
	}
	public void run() {
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D / 60D;
		
		int ticks = 0;
		int frames = 0;
		
		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		
		init();
		
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime)/nsPerTick;
			lastTime = now;
			boolean shouldRender = true;
			
			while(delta >= 1){
				ticks++;
				tick();
				delta -= 1;
				shouldRender = true;
			}
			
			try {
				Thread.sleep(2);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(shouldRender){
				frames++;
				render();
			}
			
			if(System.currentTimeMillis() - lastTimer >= 1000) {
				lastTimer += 1000;
				System.out.println(ticks + " ticks, " + frames + " frames");
				frames = 0;
				ticks = 0;
			}
		}
	}
	
	public void tick(){
		tickCount++;
		level.tick();
	}
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		
		int xOffset = player.x - (screen.width/2);
		int yOffset = player.y - (screen.height/2);

		level.renderTiles(screen, xOffset, yOffset);
//		
//		for (int x = 0; x < level.width; x++){
//			int color = Colors.get(-1, -1, -1, 000);
//			if (x % 10 == 0 && x != 0)
//				color = Colors.get(-1, -1, -1, 500);
//			Font.render((x%10) + "", screen, 0 + (x *8), 0, color, 1);
//		}
//		
//		for (int y = 0; y < level.height; y++){
//			int color = Colors.get(-1, -1, -1, 000);
//			if (y % 10 == 0 && y != 0)
//				color = Colors.get(-1, -1, -1, 500);
//			Font.render((y%10) + "", screen, 0, 0 + (y *8), color, 1);
//		}
//		^^ numbers test
		level.renderEntities(screen);
		
		
		
//		String msg = "Welcome to the";
//		String msg2 = "maze game.";
//		String intro = "Escape to win.";
		String help1 = "Use the arrow keys.";
		String help2 = "or W,S,A,D to move.";

//		String instructions1 = "Hold down 'space'";
//		String instructions2 = "for help.";

		
		Font.render(help1, screen, screen.xOffset + screen.width/2 - (help1.length()*8/2), 1, Colors.get(-1,  -1,  -1,  000), 1);
		Font.render(help2, screen, screen.xOffset + screen.width/2 - (help2.length()*8/2), 9, Colors.get(-1,  -1,  -1,  000), 1);

//		if(input.showHelp == true) {
//			Font.render(msg, screen, screen.xOffset + screen.width/2 - (msg.length()*8/2), screen.yOffset + screen.height/2 - 16, Colors.get(-1,  -1,  -1,  000), 1);
//			Font.render(msg2, screen, screen.xOffset + screen.width/2 - (msg2.length()*8/2), screen.yOffset + screen.height/2 - 8, Colors.get(-1,  -1,  -1,  000), 1);
//			Font.render(intro, screen, screen.xOffset + screen.width/2 - (intro.length()*8/2), screen.yOffset + screen.height/2 + 11, Colors.get(-1,  -1,  -1,  000), 1);
//		}

		//x and y goes by pixels. 
		//font is 8x8
		//-4 and +4 on y is to center the two lines as one

		
		for(int y = 0; y < screen.height; y++){ //copy data from Screen into Game
			for(int x = 0; x < screen.width; x++){
				int colorCode = screen.pixels[x + y * screen.width]; //x-width;y-height
				if(colorCode < 255)
					pixels[x+y * WIDTH] = colors[colorCode];
			}
		}
		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);		
		g.dispose();
		bs.show();
		
	}
	
	public static void main(String[] args) {
		new Game().start();
	}
	

}
