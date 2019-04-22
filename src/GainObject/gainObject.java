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

	public int setName(String sentName){
		name = sentName;
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

	public int setLevelUsable(int sentLevelUsable){
		levelUsable = sentLevelUsable;
	}

	public int setObjecSize(int sentObjectSize){
		objectSize = sentObjectSize;
	}

	public int setObjectType(int sentObjectType){
		if ( (sentObjectType == 1) || (sentObjectType == 0) ){
			objectType = sentObjectType;
			return 1;
		}
		return 0;
	}

	public String getName(){
		return name;
	}

	public String getDescripitionLong(){
		return description_long;
	}

	public String getDescripitionShort(){
		return description_short;
	}

	public int getLevelUsable(){
		return levelUsable;
	}

	public int getObjectSize(){
		return objectSize;
	}

	public int getObjectType(){
		return objectType;
	}
}