package org.jsp.Rest_Api;

import java.beans.JavaBean;
import jakarta.persistence.Entity;

public class Contact 
{ 
    private String id;
    private String name;
    private String phone;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
    
}
