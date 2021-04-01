package org.Q6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("dbConfig.properties")
public class dbConfig {
	
	private String Name;
    private String Url;
    private String user;
    private  String password;
    
	public String getName() {
		return Name;
	}
	@Value("${driver}")
	public void setName(String name) {
		Name = name;
	}
	public String getUrl() {
		return Url;
	}
	@Value("${url}")
	public void setUrl(String url) {
		Url = url;
	}
	public String getUser() {
		return user;
	}
	@Value("${user}")
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	@Value("${password}")
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void detail(){
        System.out.println("Driver :"+getName());
        System.out.println("Url: "+getUrl());
        System.out.println("User: "+getUser());
        System.out.println("Password: "+getPassword());
    }

}
