package com.springcarrito.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "user_person")
	private UserPerson userPerson;
	
	@Column(name = "registered")
	private Date registered;
	
	@Column(name = "total")
	private float total;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(UserPerson userPerson, Date registered, float total) {
		super();
		this.userPerson = userPerson;
		this.registered = registered;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserPerson getUserPerson() {
		return userPerson;
	}

	public void setUserPerson(UserPerson userPerson) {
		this.userPerson = userPerson;
	}

	public Date getRegistered() {
		return registered;
	}

	public void setRegistered(Date registered) {
		this.registered = registered;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
}
