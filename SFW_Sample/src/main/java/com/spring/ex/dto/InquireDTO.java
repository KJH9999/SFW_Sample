package com.spring.ex.dto;

public class InquireDTO {
	
	private int idx;
	private String email;
	private String question;
	private String answer;	
	private String at_time;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAt_time() {
		return at_time;
	}
	public void setAt_time(String at_date) {
		this.at_time = at_date;
	}
	
	@Override
	public String toString() {
		return "InquireDTO [idx=" + idx + ", email=" + email + ", question=" + question + ", answer=" + answer
				+ ", at_date=" + at_time + "]";
	}
	
}
