package com.springcarrito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_has_grade")
public class UserHasGrade {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "grade")
	private int grade;
	
	@Column(name = "comment")
	private String comment;
	
	@Column(name = "user_person")
	private UserPerson userPerson;
	
	@Column(name = "course")
	private Course course;

	public UserHasGrade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserHasGrade(int grade, String comment, UserPerson userPerson, Course course) {
		super();
		this.grade = grade;
		this.comment = comment;
		this.userPerson = userPerson;
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public UserPerson getUserPerson() {
		return userPerson;
	}

	public void setUserPerson(UserPerson userPerson) {
		this.userPerson = userPerson;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
