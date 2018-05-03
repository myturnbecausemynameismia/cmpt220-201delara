package ca.miadelara.game.level;

import java.util.ArrayList;
import java.util.List;

import ca.miadelara.game.entities.Entity;
import ca.miadelara.game.gfx.Screen;
import ca.miadelara.game.level.tiles.Tile;

public class Level {

	private byte[] tiles; // array of IDs
	public int width;
	public int height;
	public List<Entity> entities = new ArrayList<Entity>();
	public boolean [][] isBush = new boolean[32][32];
	//row col; [height][width]
	public int [][] bushLocs = {
			{0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}//0
			, {10, 14, 18, 31}																	//1
			, {0, 10, 12, 14, 16, 18, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31}					//2
			, {0, 10, 12, 14, 16, 18, 20, 31}														//3
			, {0, 10, 12, 14, 16, 18, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31}					//4
			, {0, 12, 14, 16, 18, 20, 31}															//5
			, {0, 1,2,3,4,5,6,7,8,9,10, 12, 14, 16, 18, 20,22,23,24,25,26,27,28,29,30, 31}			//6
			, {0, 12, 16, 20, 31}																	//7
			, {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,21,22,23,24,25,26,27,28,29,31}	//8
			, {0,4,8,12,16,20,21,23,25,28,31}														//9
			, {0,1,2,4,6,8,10,14,18,20,23,25,27,28,30,31}											//10
			, {0,4,6,10,11,12,13,14,15,16,17,18,20,22,23,31}										//11
			, {0,2,3,4,6,8,10,18,20,23,27,2,28,29,30,31}												//12
			, {0,6,8,10,11,12,13,14,15,16,18,20,21,23,25,31} 										//13
			, {0,1,2,3,4,5,6,8,12,16,18,23,25,26,27,28,29,30,31} 									//14
			, {0,8,10,14,16,18,19,20,21,22,23,31}													//15
			, {0,1,2,3,4,6,7,8,9,10,11,12,13,14,16,20,23,24,25,26,27,28,29,31}						//16
			, {0,4,8,12,16,18,20,31}																//17
			, {0,2,4,5,6,8,10,12,14,15,16,18,20,22,23,24,25,26,27,28,29,30,31}						//18
			, {0,2,4,8,10,12,14,18,31}															//19
			, {0,2,6,7,8,10,12,14,15,16,18,20,21,22,23,24,25,26,27,28,29,31}						//20
			, {0,1,2,3,4,5,6,10,12,18,20,31}														//21
			, {0,6,7,8,9,10,12,13,14,15,16,17,18,20,22,23,24,25,26,27,28,29,30,31}					//22
			, {0,2,3,4,10,20,31}																	//23
			, {0,2,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,31}		//24
			, {0,2,4,8,31}																			//25
			, {0,2,4,6,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}		//26
			, {0,2,4,6,8,12,19,21,23,31}															//27
			, {0,2,6,8,10,12,14,15,16,21,23,31}														//28
			, {0,2,4,5,6,8,10,12,14,16,18,19,20,21,31}												//29
			, {0,6,10,14,23,31}																		//30
			, {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}//31

	};

	public Level(int width, int height) {
		tiles = new byte[width * height];
		this.width = width;
		this.height = height;
		this.generateLevel();
	}

	public void generateLevel() {
		//set up the isBush 
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < bushLocs[i].length; j++){
				isBush[i][bushLocs[i][j]] = true;
			}
			
		}
		
		for (int y = 0; y < height; y++) { // box
			for (int x = 0; x < width; x++) {
				//tiles[x + y * width] = Tile.GRASS.getId();
				// grass and stone patternvv
//				if (x * y % 10 < 7){
//					tiles[x + y * width] = Tile.GRASS.getId();
//				} else {
//					tiles[x + y * width] = Tile.BUSH.getId();
//				}
//				if (x == 0 || x == width || y == 0 || y == height)
//					tiles[x + y * width] = Tile.BUSH.getId();
				if (isBush[y][x] == true)
					tiles[x + y * width] = Tile.BUSH.getId();
				else if ((y == 11 && x == 8) || (y == 3 && x == 21) || (y == 9 && x == 24) || 
						(y == 19 && x == 16) || (y == 20 && x == 1) || (y == 24 && x == 3) || 
						(y == 29 && x == 15))
					tiles[x + y * width] = Tile.ROCK.getId();
				else
					tiles[x + y * width] = Tile.GRASS.getId();
				// might not need for loop
			}
		}
	}

	public void tick(){
		for (Entity e : entities) {
			e.tick();
		}
	}
	
	// camera
	public void renderTiles(Screen screen, int xOffset, int yOffset) {
		if (xOffset < 0)
			xOffset = 0;
		if (xOffset > ((width << 3) - screen.width))
			xOffset = ((width << 3) - screen.width);
		if (yOffset < 0)
			yOffset = 0;
		if (yOffset > ((height << 3) - screen.height))
			yOffset = ((height << 3) - screen.height);

		screen.setOffset(xOffset, yOffset);

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				getTile(x, y).render(screen, this, x << 3, y << 3);
			}
		}
	}
	
	public void renderEntities(Screen screen) {
		for (Entity e : entities) {
			e.render(screen);
		}
	}

	public Tile getTile(int x, int y) {
		if (0 > x || x >= width || 0 > y || y >= height)
			return Tile.VOID;
		return Tile.tiles[tiles[x + y * width]];
	}
	
	public void addEntity(Entity entity) {
		this.entities.add(entity);
	}
}
