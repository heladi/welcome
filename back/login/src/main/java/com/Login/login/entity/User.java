package com.Login.login.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table - User
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;


	protected User() {
		
	}
	
	public User(long id, String name) {
		super();
//		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
}
