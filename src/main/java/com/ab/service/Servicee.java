package com.ab.service;

import org.springframework.stereotype.Service;

import com.ab.model.Model;

@Service
public class Servicee {

	
	public Model getData(){
		
		Model m=new Model();
		m.setId(1);
		m.setName("Ab khuddus");
		m.setAddres("Amirpeth hyd");
		m.setMobilenumber("9730932093");
		return m;
	}
}
