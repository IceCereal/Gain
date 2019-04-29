package io.github.IceCereal.core.builder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class buildGame{
	String authorName; 	// defaults ["IceCereal's-Discipile"]
	String gameName; 	// defaults ["The-Game-Of-Ice"]

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date curDate = new Date();

	public buildGame(){
		authorName = "IceCereal's-Discipile";
		gameName = "The-Game-Of-Ice";
	}
}