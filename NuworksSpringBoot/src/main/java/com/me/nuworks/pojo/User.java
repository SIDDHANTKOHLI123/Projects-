package com.me.nuworks.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.me.nuworks.pojo.enumTypes.Role;

import javax.persistence.*;



@Entity
@Table(name="USER")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserID", unique=true, nullable=false)
	private int id;
	
	@Column(name="userName", unique=true)
	private String userName;
	
	@Column(name="password")
	private String password;

	@Enumerated(EnumType.ORDINAL)
	@Column(name="Role")
	private Role role;
	
	public User() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}