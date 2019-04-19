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

}