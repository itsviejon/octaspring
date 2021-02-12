package com.springcarrito.dao;

import java.util.List;

import com.springcarrito.entity.Lang;

public interface LangInterface {
	
	public void save(Lang lang);

	public void update(Lang lang);

	public void delete(long id);
	
	public List<Lang> findByAll();
	
	public Lang findById(long id);
	
	
}
