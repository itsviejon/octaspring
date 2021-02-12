package com.springcarrito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_question_answer")
public class CourseQuestionAnswer {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "question")
	private CourseQuestion question;
	
	@Column(name = "user_person")
	private UserPerson userPerson;
	
	@Column(name = "answer")
	private String answer;

	public CourseQuestionAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseQuestionAnswer(CourseQuestion question, UserPerson userPerson, String answer) {
		super();
		this.question = question;
		this.userPerson = userPerson;
		this.answer = answer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CourseQuestion getQuestion() {
		return question;
	}

	public void setQuestion(CourseQuestion question) {
		this.question = question;
	}

	public UserPerson getUserPerson() {
		return userPerson;
	}

	public void setUserPerson(UserPerson userPerson) {
		this.userPerson = userPerson;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
