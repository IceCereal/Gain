package io.github.IceCereal.src.RoomUtils.Utils;

import java.util.ArrayList;
import java.util.List;

class Door{
	private List<Integer> coordinatesFrom; 	// Door opens from these coords
	private List<Integer> coordinatesTo; 	// Door opens to these coords

	Bool key_required; 	// Boolean that checks whether the key is required
	int key_id; 	// If key_required: True, key_id represents the key id for the door

	public Door(){
		coordinatesFrom.add(0);
		coordinatesFrom.add(0);

		coordinatesTo.add(0);
		coordinatesTo.add(0);

		key_required = false;
		key_id = -1;
	}

	public int setFromCoords(List<Integer> sentCoordinatesFrom){
		coordinatesFrom.remove(0);
		coordinatesFrom.remove(1);

		coordinatesFrom.add(sentCoordinatesFrom.get(0));
		coordinatesFrom.add(sentCoordinatesFrom.get(1));

		return 1;
	}

	public setToCoords(List<Integer> sentCoordinatesTo){
		coordinatesTo.remove(0);
		coordinatesTo.remove(1);

		coordinatesTo.add(sentCoordinatesTo.get(0));
		coordinatesTo.add(sentCoordinatesTo.get(1));

		return 1;
	}

	public setCoords(List<Integer> sentCoordinatesFrom, List<Integer> sentCoordinatesTo){
		coordinatesFrom.remove(0);
		coordinatesFrom.remove(1);

		coordinatesFrom.add(sentCoordinatesFrom.get(0));
		coordinatesFrom.add(sentCoordinatesFrom.get(1));

		coordinatesTo.remove(0);
		coordinatesTo.remove(1);

		coordinatesTo.add(sentCoordinatesTo.get(0));
		coordinatesTo.add(sentCoordinatesTo.get(1));

		return 1;
	}

	public int setKeyRequired(int sentKey_Required){
		key_required = sentKey_Required;
		
		return 1;
	}

	public int setKeyID(int sentKey_ID){
		key_id = sentKey_ID;

		return 1;
	}

	public List<Integer> getCoordinatesFrom(){
		return coordinatesFrom;
	}

	public List<Integer> getCoordinatesTo(){
		return coordinatesTo;
	}

	public List<List> getCoordinates(){
		List<List> coordinates;
		
		coordinates.add(coordinatesFrom);
		coordinates.add(coordinatesTo);

		return coordinates;
	}

	public Bool getKeyRequired(){
		return key_required;
	}

	public int getKeyID(){
		return key_id;
	}
}