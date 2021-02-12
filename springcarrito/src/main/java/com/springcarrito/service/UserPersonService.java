package com.springcarrito.service;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcarrito.dao.UserPersonInterface;
import com.springcarrito.entity.UserPerson;

public class UserPersonService implements UserPersonInterface {

	private JdbcTemplate jdbcTemplate;
	
	private String sql;
	
	public UserPersonService(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public void save(UserPerson userPerson) {
		// TODO Auto-generated method stub
		sql = "INSERT INTO user_person (name, lastname, email, password, gender, status, registered, photo) VALUES (?,?,?,?,?,?,?,?)";
		userPerson.setRegistered(new  Date());
		userPerson.setPhoto("default.png");
		userPerson.setStatus(1);
		jdbcTemplate.update(sql, userPerson.getName(), userPerson.getLastname(), userPerson.getEmail(), userPerson.getPassword(), userPerson.getGender(), userPerson.getStatus(), userPerson.getStatus(), userPerson.getRegistered(), userPerson.getPhoto());
	}

	@Override
	public void update(UserPerson userPerson) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserPerson> findByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPerson findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
