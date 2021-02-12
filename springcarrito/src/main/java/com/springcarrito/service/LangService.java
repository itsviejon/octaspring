package com.springcarrito.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcarrito.dao.LangInterface;
import com.springcarrito.entity.Lang;

public class LangService implements LangInterface{

	private JdbcTemplate jdbcTemplate;
	
	private String sql;
	
	public LangService(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(Lang lang) {
		sql = "INSERT INTO lang(lang) value (?);";
		jdbcTemplate.update(sql, lang.getLang());
		
	}

	@Override
	public void update(Lang lang) {
		sql = "UPDATE lang SET lang = ? WHERE id = ?;";
		jdbcTemplate.update(sql,lang.getLang(),lang.getId());
	}

	@Override
	public void delete(long id) {
		sql = "DELETE FROM lang WHERE id = ?;";
		jdbcTemplate.update(sql,id);
	}

	@Override
	public List<Lang> findByAll() {
		sql = "SELECT * FROM lang;";
		return this.jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Lang.class));
	}

	@Override
	public Lang findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
