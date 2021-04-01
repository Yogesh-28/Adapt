package org.Q5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Triangle {
	
	private Type type;

	public Type getType() {
		return type;
	}

	@Required
	@Resource(name="type")
	public void setType(Type type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println(getType().getType() + "triangle drawn.");
	}
}
