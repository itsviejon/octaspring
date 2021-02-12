package com.springcarrito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "role")
	private Role role;
	
	@Column(name = "user_person")
	private UserPerson userPerson;
	
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRole(Long id, Role role, UserPerson userPerson) {
		super();
		this.id = id;
		this.role = role;
		this.userPerson = userPerson;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public UserPerson getUserPerson() {
		return userPerson;
	}

	public void setUserPerson(UserPerson userPerson) {
		this.userPerson = userPerson;
	}
	
	
}
