package ca.miadelara.game.level.tiles;

import ca.miadelara.game.gfx.Colors;
import ca.miadelara.game.gfx.Screen;
import ca.miadelara.game.level.Level;

public abstract class Tile {
	public static final Tile[] tiles = new Tile[256];
	public static final Tile VOID = new BasicSolidTile(0, 0, 0, Colors.get(000,  -1, -1, -1));;
	public static final Tile BUSH = new BasicSolidTile(1, 1, 0, Colors.get(-1, 142, 131, 503));
	public static final Tile GRASS = new BasicTile(2, 2, 0, Colors.get(-1, 131, 141, -1));
	public static final Tile ROCK = new BasicPickUpTile(3, 3, 0, Colors.get(131, 111, 222, 444));
	//BasicPickUpTile and BasicSolidTile classes are basically
	//the same for now. I plan to make the rocks collectible objects
	//in the future.
	
	protected byte id; //location in array where tile is
	protected boolean solid; //collision detection
	protected boolean emitter; //light
	protected boolean pickUp; //item collectable
	
	public Tile(int id, boolean isSolid, boolean isEmitter){
		this.id = (byte) id;
		if (tiles[id] != null)
			throw new RuntimeException("Duplicate tile id on " + id);
		this.solid = isSolid;
		this.emitter = isEmitter;
		tiles[id] = this;
	}
	
	public byte getId() {
		return id;
	}
	
	public boolean isSolid() {
		return solid;
	}
	
	public boolean isEmitter() {
		return emitter;
	}
	
	public boolean isPickUp() {
		return pickUp;
	}
	
	public abstract void render(Screen screen, Level level, int x, int y);
	
}
