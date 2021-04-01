package org.Q9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {

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
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initialize circle bean by afterPropertiesSet function");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy triangle bean by destroy function");
	}
}
