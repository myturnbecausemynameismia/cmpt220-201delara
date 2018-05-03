//BasicPickUpTile and BasicSolidTile classes are basically
//the same for now. I plan to make the rocks collectible objects
//in the future.
package ca.miadelara.game.level.tiles;

public class BasicSolidTile extends BasicTile{

	public BasicSolidTile(int id, int x, int y, int tileColor) {
		super(id, x, y, tileColor);
		this.solid = true;
	}

}
