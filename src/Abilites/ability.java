package io.github.IceCereal.src.Abilites;

import java.util.HashMap;
import java.util.Map;

public class ability{
	Map<String, Integer> Abilities = new HashMap<String, Integer>();	
	/*
		Extra Abilites that the player could have: defaults [None]
		Every Ability created can have  called Ability_Reductor:
			Does Ability reduce every round: defaults [0]
		Ex:
			Mana: 200
			Mana_Reductor: 3
	*/

	public int addAbility(String abilityName, int abilityValue){
		Abilities.put(abilityName, abilityValue);
		return 1;
	}

	public int addAbility_Reductor(String abilityName, int ability_Reductor){
		if (checkAbilityExist(abilityName)){
			StringBuilder abilityReductorBuilder = new StringBuilder();
			abilityReductorBuilder.append(abilityName);
			abilityReductorBuilder.append("_Reductor");

			String abilityName_Reductor = abilityReductorBuilder.toString();

			this.addAbility(abilityName_Reductor, ability_Reductor);
			return 1;
		}
		return -1;
	}

	public boolean checkAbilityExist(String abilityName){
		return Abilities.containsKey(abilityName);
	}

	public String getAbilityValue(String abilityName){
		if (checkAbilityExist(abilityName))
			return Abilities.get(abilityName).toString();
		return "Fail";
	}

	public Map<String, Integer> getAllAbilities(){
		return Abilities;		
	}

	public int deleteAbility(String abilityName){
		Abilities.remove(abilityName);
		return 1;
	}
}

