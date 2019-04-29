package io.github.IceCereal.src.RoomUtils.Utils;

class Key{
	private int key_id; 	// Engine set key_id
	private Boolean hasKey; 	// Not sure if this will be useful, but I'll keep it here for now

	public Key(){
		key_id = 0;
		hasKey = false;
	}

	public int getKey_id() {
		return key_id;
	}

	public Boolean getHasKey() {
		return hasKey;
	}

	public void setKey_id(int key_id) {
		this.key_id = key_id;
	}

	public void setHasKey(Boolean hasKey) {
		this.hasKey = hasKey;
	}
}