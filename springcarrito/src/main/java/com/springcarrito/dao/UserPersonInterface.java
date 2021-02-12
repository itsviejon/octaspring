package com.springcarrito.dao;

import java.util.List;

import com.springcarrito.entity.UserPerson;


public interface UserPersonInterface {
	public void save(UserPerson userPerson);

	public void update(UserPerson userPerson);

	public void delete(long id);
	
	public List<UserPerson> findByAll();
	
	public UserPerson findById(long id);
}	
