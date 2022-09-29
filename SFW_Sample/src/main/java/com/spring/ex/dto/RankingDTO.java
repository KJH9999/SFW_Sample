package com.spring.ex.dto;

public class RankingDTO {
	private String email;
	private String name;
	private int bench;
	private int dead;
	private int squat;
	private int total;
	private String regist;
	
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
	public int getBench() {
		return bench;
	}
	public void setBench(int bench) {
		this.bench = bench;
	}
	public int getDead() {
		return dead;
	}
	public void setDead(int dead) {
		this.dead = dead;
	}
	public int getSquat() {
		return squat;
	}
	public void setSquat(int squat) {
		this.squat = squat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getRegist() {
		return regist;
	}
	public void setRegist(String regist) {
		this.regist = regist;
	}
	
	@Override
	public String toString() {
		return "RankingDTO [email=" + email + ", name=" + name + ", bench=" + bench + ", dead=" + dead + ", squat="
				+ squat + ", total=" + total + ", regist=" + regist + "]";
	}
	
	
	
}
