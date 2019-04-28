package io.github.IceCereal.src.RoomUtils.Room;

import java.util.ArrayList;
import java.util.List;

public class Room{
	private List<Integer> coordinates;	// The X, Y coordinates of the room. Internal property set by Core Engine

	private String name;	// Room name: defaults ["Unknown"]
	
	private String description_long;	// Long Description of Room: defaults ["There seems to be nothing special here"]
	private String description_short;	// Short Description of Room: defaults ["There seems to be nothing special here"]

	// TODO: implement an array of Gainbjects

	public Room(List<Integer> sentCoordinates){
		coordinates = new ArrayList<Integer>();

		coordinates.add(sentCoordinates.get(0));
		coordinates.add(sentCoordinates.get(1));

		name = "Unknown";
		description_long = "There seems to be nothing special about here";
		description_short = "There seems to be nothing special about here";
	}

	public int changeCoordinates(List<Integer> sentCoordinates){
		coordinates.remove(0);
		coordinates.remove(1);

		coordinates.add(sentCoordinates.get(0));
		coordinates.add(sentCoordinates.get(1));

		return 1;
	}

	public int setName(String sentRoomName){
		name = sentRoomName;
		return 1;
	}

	public int setDescription_Long(String sentDescription_Long){
		description_long = sentDescription_Long;
		return 1;
	}

	public int setDescription_Short(String sentDescription_Short){
		description_short = sentDescription_Short;
		return 1;
	}

	public List<Integer> getCoordinates(){
		return coordinates;
	}

	public String getName(){
		return name;
	}

	public String getDescription_Long(){
		return description_long;
	}

	public String getDescription_Short(){
		return description_short;
	}
}