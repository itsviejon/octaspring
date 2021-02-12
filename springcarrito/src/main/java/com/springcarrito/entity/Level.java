package com.springcarrito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "level")
public class Level {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "lang")
	private Lang lang;

	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Level( Lang lang) {
		super();
	
		this.lang = lang;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Lang getLang() {
		return lang;
	}

	public void setLang(Lang lang) {
		this.lang = lang;
	}
	
	
	
}
