package com.lan.jta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lan.jta.service.JtaService;

@Controller
public class JtaController {
	
	@Autowired
	private JtaService JtaService;

	@RequestMapping(value = "/jta", method = RequestMethod.GET)
	public @ResponseBody String jta(){
		try{
			return JtaService.jta();
		}catch(Exception e){
			return e.getMessage();
		}
	}
	
}
