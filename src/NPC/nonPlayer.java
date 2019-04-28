package io.github.IceCereal.src.NPC;

class NPC{
	String name; 	// Name of the NPC: defaults ["NPC-Ice"]

	String description_long;	// Long Description of Character: defaults [null]
	String description_short;	// Short Description of Character: defaults [null]

	int healthPoints;	// HP: defaults [100]
	int healthPoints_Reductor; 	// Does HP reduce every round: defaults [0]

	int typeNPC;
	/*
		NPC Types:
			0 - Friendly
			1 - Guide
			2 - Enemy
	*/

	int attackingLevel; // Level at which the NPC attacks: defaults [0] (range 0 - 9)

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

	public void setTypeNPC(int typeNPC) {
		this.typeNPC = typeNPC;
	}

	public void setAttackingLevel(int attackingLevel) {
		this.attackingLevel = attackingLevel;
	}
}