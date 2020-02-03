package com.ab.model;

public class Model {

	private int id;
	private String name;
	private String addres;
	private String mobilenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;

	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", addres=" + addres + ", mobilenumber=" + mobilenumber + "]";
	}
	
}
