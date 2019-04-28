package io.github.IceCereal.src.RoomUtils.Utils;

import java.util.ArrayList;
import java.util.List;

class Door{
	private List<Integer> coordinatesFrom; 	// Door opens from these coords
	private List<Integer> coordinatesTo; 	// Door opens to these coords

	Bool key_required; 	// Boolean that checks whether the key is required
	int key_id; 	// If key_required: True, key_id represents the key id for the door
}