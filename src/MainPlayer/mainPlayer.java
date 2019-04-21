package io.github.IceCereal.src.MainPlayer;

public class mainPlayer{
	String name;	// Character name: defaults ["Ice"]
	
	String description_long;	// Long Description of Character: defaults [null]
	String description_short;	// Short Description of Character: defaults [null]

	int level; 	// Character Level: defaults [0]
	int healthPoints;	// HP: defaults [100]
	int healthPoints_Reductor; 	// Does HP reduce every round: defaults [0]
	int experiencePoints; 	// XP: defaults [0]	

	// IMPORT `ABILITES` & CREATE INSTANCE
	// IMPORT `GAIN-OBJECT` & USE IT TO CREATE INSTANCE

	mainPlayer(){
		name = "Ice";
		description_long = null;
		description_short = null;

		level = 0;
		healthPoints = 100;
		healthPoints_Reductor = 0;
		experiencePoints = 0;
	}

	public int setName(String sentName){
		this.name = sentName;
		return 1;
	}

	public int setDescription_Long(String sentDescLong){
		this.description_long = sentDescLong;
		return 1;
	}

	public int setDescription_Short(String sentDescShort){
		this.description_short = sentDescShort;
		return 1;
	}

	public int setLevel(int sentLevel){
		this.level = sentLevel;
		return 1;
	}

	public int setHP(int sentHealthPoints){
		this.healthPoints = sentHealthPoints;
		return 1;
	}

	public int setHP_Reductor(int sentHealthPoints_Reductor){
		this.healthPoints_Reductor = sentHealthPoints_Reductor;
		return 1;
	}

	public int setXP(int sentExperiencePoints){
		this.experiencePoints = sentExperiencePoints;
		return 1;
	}
}