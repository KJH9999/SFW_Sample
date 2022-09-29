package com.spring.ex.dto;

public class BoardDTO {
	private int idx;
	private String title;
	private String email;
	private String at_time;
	private int hit;
	private String content;
	
	public BoardDTO() {
		
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAt_time() {
		return at_time;
	}

	public void setAt_time(String at_time) {
		this.at_time = at_time;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardDTO [idx=" + idx + ", title=" + title + ", email=" + email + ", at_time=" + at_time + ", hit="
				+ hit + ", content=" + content + "]";
	}
	
}
