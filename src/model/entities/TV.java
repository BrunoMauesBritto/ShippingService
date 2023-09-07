package model.entities;

public class TV {

	private String model;
	

	public TV () {
		
	}
	
	public TV(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	
	public String toString() {
		return model ;
	}
	
	
	
	
	
}

