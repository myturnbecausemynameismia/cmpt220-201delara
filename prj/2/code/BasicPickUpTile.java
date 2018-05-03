package ca.miadelara.game.level.tiles;

public class BasicPickUpTile extends BasicTile{

	public BasicPickUpTile(int id, int x, int y, int tileColor) {
		super(id, x, y, tileColor);
		this.pickUp = true;
	}

}
