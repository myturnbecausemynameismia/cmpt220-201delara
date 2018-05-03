package ca.miadelara.game.entities;

import ca.miadelara.game.InputHandler;
import ca.miadelara.game.gfx.Colors;
import ca.miadelara.game.gfx.Screen;
import ca.miadelara.game.level.Level;
import ca.miadelara.game.level.tiles.Tile;

public class Player extends Mob{
	
	private InputHandler input;
	private int color = Colors.get(-1, 111, 125, 543);
	private int scale = 1;

	public Player(Level level, int x, int y, InputHandler input) {
		super(level, "Player", x, y, 1);
		this.input = input;
	}

	public void tick() {
		int xa = 0; 
		int ya = 0;
		
		if(input.up.isPressed()){
			ya--;
		}
		if(input.down.isPressed()){
			ya++;
		}
		if(input.left.isPressed()){
			xa--;
		}
		if(input.right.isPressed()){
			xa++;
		}
		
		if (xa != 0 || ya != 0) {
			move(xa, ya);
			isMoving = true;
		} else {
			isMoving = false;
		}
	}

	public void render(Screen screen) {
		int xTile = 0;
		int yTile = 28; //where the player is
		int walkingSpeed = 3; //higher number makes speed slower
		int flipTop = (numSteps >> walkingSpeed) & 1; //bet 0 and 1
		int flipBottom = (numSteps >> walkingSpeed) & 1;
		
		if (movingDir == 1) {
			xTile += 2; //2nd sprite
		} else if(movingDir > 1) {
			xTile += 4 + ((numSteps >> walkingSpeed) & 1) * 2;
			flipTop = (movingDir - 1) % 2;
		}
		
		int modifier = 8 * scale; //size scale
		int xOffset = x - modifier / 2;
		int yOffset = y - modifier / 2 - 4; //make waist of player the centerof y
		
		screen.render(xOffset + (modifier * flipTop), yOffset, xTile + yTile * 32, color, flipTop, scale); //first tile
		screen.render(xOffset + modifier - (modifier * flipTop), yOffset, (xTile + 1) + yTile * 32, color, flipTop, scale);
		//upper body vv; lower body ^^
		screen.render(xOffset + (modifier * flipBottom), yOffset + modifier, xTile + (yTile + 1) * 32, color, flipBottom, scale); //down
		screen.render(xOffset + modifier - (modifier * flipBottom), yOffset + modifier, (xTile+1) + (yTile+1) * 32, color, flipBottom, scale);

	}
	
	//collision detection
	public boolean hasCollided(int xa, int ya) {
		int xMin = 0;//min and maxes are box collider points
		int xMax = 7;
		int yMin = 3;
		int yMax = 7; 
		//following loops connect collider box
		for (int x = xMin; x < xMax; x++){
			if (isSolidTile(xa, ya, x, yMin)){
				return true;
			} else if(isPickUpTile(xa, ya, x, yMin)) {
				return true; //BasicPickUpTile and BasicSolidTile classes are basically
			}				//the same for now. I plan to make the rocks collectible objects
		}					//in the future.
		for (int x = xMin; x < xMax; x++){
			if (isSolidTile(xa, ya, x, yMax)){
				return true;
			}else if(isPickUpTile(xa, ya, x, yMax)) {
				return true;
			}
		}
		for (int y = yMin; y < yMax; y++){
			if (isSolidTile(xa, ya, xMin, y)){
				return true;
			}else if(isPickUpTile(xa, ya, xMin, y)) {
				return true;
			}
		}
		for (int y = yMin; y < yMax; y++){
			if (isSolidTile(xa, ya, xMax, y)){
				return true;
			}else if(isPickUpTile(xa, ya, xMax, y)) {
				return true;
			}
		}
		return false;
	}

}
