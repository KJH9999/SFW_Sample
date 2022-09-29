package com.spring.ex.dto;

public class RegistDTO {
	private String email;
	private String name;
	private int select;
	private int pay;
	private String registday;
	private String expiration;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getRegistday() {
		return registday;
	}
	public void setRegistday(String registday) {
		this.registday = registday;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	@Override
	public String toString() {
		return "RegistDTO [email=" + email + ", name=" + name + ", select=" + select + ", pay=" + pay + ", registday="
				+ registday + ", expiration=" + expiration + "]";
	}

	
}
