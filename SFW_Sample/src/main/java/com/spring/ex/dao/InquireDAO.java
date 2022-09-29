package com.spring.ex.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.ex.dto.BoardDTO;

@Repository
public interface InquireDAO {
	//문의사항 추가
	public void insertBoard(String email, String question);
	//내 문의사항 리스트
	public List<BoardDTO> myinqurie(String email);
	//전체문의사항 리스트
	public List<BoardDTO> allinqurie();
	//답변하기
	public void answer(String idx, String answer);
	//답변안된 문의사항
	public List<BoardDTO> nullinqurie();

}
