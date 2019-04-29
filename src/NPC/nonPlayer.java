package io.github.IceCereal.src.NPC;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class NPC{
	String name; 	// Name of the NPC: defaults ["NPC-Ice"]

	String description_long;	// Long Description of Character: defaults [null]
	String description_short;	// Short Description of Character: defaults [null]

	Map<Integer, String> DescriptionMap = new HashMap<Integer, String>();
	/*
		Pull up this description when I say so, essentially.
			0 - Okay, go to that room
			1 - You will die soon
			2 - blah de blah de blah
		<This action requires this Description>
	*/

	int healthPoints;	// HP: defaults [100]
	int healthPoints_Reductor; 	// Does HP reduce every round: defaults [0]

	int typeNPC;
	/*
		NPC Types:
			0 - Friendly
			1 - Guide
			2 - Enemy
	*/ // defaults [0]

	int attackingLevel; // Level at which the NPC attacks: defaults [0] (range 0 - 10)

	public NPC(){
		name = "NPC-Ice";

		description_long = null;
		description_short = null;
		
		healthPoints = 100;
		healthPoints_Reductor = 0;

		typeNPC = 0;
		attackingLevel = 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription_long(String description_long) {
		this.description_long = description_long;
	}

	public void setDescription_short(String description_short) {
		this.description_short = description_short;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void setHealthPoints_Reductor(int healthPoints_Reductor) {
		this.healthPoints_Reductor = healthPoints_Reductor;
	}

	public int setTypeNPC(int typeNPC) {
		if ( (typeNPC >= 0) && (typeNPC <= 2)){
			this.typeNPC = typeNPC;
			return 1;
		}
		return -1;
		
	}

	public void setAttackingLevel(int attackingLevel) {
		if ((attackingLevel >=0) && (attackingLevel <=10))
			this.attackingLevel = attackingLevel;
		if (attackLevel > 10)
			this.attackingLevel = 10;
		if (attackLevel < 0)
			this.attackingLevel = 0;
	}

	public void addTo_DescriptionMap(int key, String value) {
		DescriptionMap.put(key, value);
	}

	public String getName() {
		return name;
	}
	
	public String getDescription_long() {
		return description_long;
	}
	
	public String getDescription_short() {
		return description_short;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	
	public int getHealthPoints_Reductor() {
		return healthPoints_Reductor;
	}
	
	public int getTypeNPC() {
		return typeNPC;
	}
	
	public int getAttackingLevel() {
		return attackingLevel;
	}

	public Map<Integer, String> getDescriptionMap() {
		return DescriptionMap;
	}

	public int Attack(){
		Random rand = new Random(3010);
		int attackMagnitude = rand.nextInt(attackingLevel);

		return attackMagnitude;
		// NOTE: Core will adjust the actual value to be scaled depending on MP's HP
	}
}