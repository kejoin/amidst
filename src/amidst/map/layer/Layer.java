package amidst.map.layer;

import amidst.map.Map;

public abstract class Layer {
	private Map map;

	public void setMap(Map map) {
		this.map = map;
	}

	public Map getMap() {
		return map;
	}

	public boolean isVisible() {
		return true;
	}
}
