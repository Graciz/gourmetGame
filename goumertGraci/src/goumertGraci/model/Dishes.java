package goumertGraci.model;

public class Dishes {

	private String name;
	private String feature;

	public Dishes(String name, String feature) {
		this.name = name;
		this.feature = feature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

}
