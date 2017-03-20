package com.lan.jta.service;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JtaServiceImpl implements JtaService{

	@Resource(name = "jdbcTemplate_103")
	private JdbcTemplate jdbcTemplate_103;
	
	@Resource(name = "jdbcTemplate_104")
	private JdbcTemplate jdbcTemplate_104;
	
	@Transactional (propagation = Propagation.REQUIRED,timeout=30)
	public String jta(){
		
		jdbcTemplate_103.update("update test set `status` = 'N' where id = 1");
		jdbcTemplate_104.update("update test set id = 'N' where id = 1");
		
		return "jta";
	}
	
}
