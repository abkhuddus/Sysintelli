package com.ab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ab.model.Model;
import com.ab.service.Servicee;

@Controller
public class MyController {

	@Autowired
	private Servicee ser;
	
	@GetMapping(value="/get",produces="application/json")
	ResponseEntity<Model> hi() {
		Model m=ser.getData();
	    return new ResponseEntity<Model>(m, HttpStatus.OK);}
	
	
	@GetMapping("/hello")
	ResponseEntity<String> hello() {
	    return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
}
