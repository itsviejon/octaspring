package com.springcarrito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_has_course")
public class UserHasCourse {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "course")
	private Course course;

	@Column(name = "owner")
	private UserPerson owner;

	public UserHasCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserHasCourse(Course course, UserPerson owner) {
		super();
		this.course = course;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public UserPerson getOwner() {
		return owner;
	}

	public void setOwner(UserPerson owner) {
		this.owner = owner;
	}
	
	
}
