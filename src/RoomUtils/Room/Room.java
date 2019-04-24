package io.github.IceCereal.src.RoomUtils.Room;

public class Room{
	private int x, y;	// The X, Y coordinate of the room. Internal property set by Core Engine

	private String name;	// Room name: defaults ["Unknown"]
	
	private String description_long;	// Long Description of Room: defaults ["There seems to be nothing special here"]
	private String description_short;	// Short Description of Room: defaults ["There seems to be nothing special here"]

	// TODO: implement an array of Gainbjects

	public Room(int sentX, int sentY){
		x = sentX;
		y = sentY;

		name = "Unknown";
		description_long = "There seems to be nothing special about here";
		description_short = "There seems to be nothing special about here";
	}
}