package io.github.IceCereal.src.GainObject;

public class gainObject{
	String name;	// Character name: defaults ["Object-Ice"]
	
	String description_long;	// Long Description of Character: defaults [null]
	String description_short;	// Short Description of Character: defaults [null]

	int levelUsable; 	// The level at which the main player can unlock it: defaults [0]
	int objectSize;	// Size of the object: defaults [1]

	int objectType;
	/*
		Object Types:
			0 - Consumable
			1 - Attack
	*/

	gainObject(){
		name = "Object-Ice";
		description_long = null;
		description_short = null;

		levelUsable = 0;
		objectSize = 1;
	}
}