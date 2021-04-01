package org.Q8;

public class Triangle {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println(type + " triangle drawn.");
	}
	
	public void myInit() {
		System.out.println("myInit method called for triangle class.");
	}
	
	public void cleanUp() {
		System.out.println("cleanUp method called for triangle class.");
	}
}
