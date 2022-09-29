package com.spring.ex.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.spring.ex.dto.BoardDTO;

@Repository 
public interface InquireService {
	//문의사항 추가
	public void insertInquire(Model model);
	//본인 문의사항 리스트
	public List<BoardDTO> myinquire(String email);
	//전체 문의사항 리스트(admin)
	public List<BoardDTO> allinquire();
	//답변하기
	public void answer(Model model);
	//답변안된 문의사항(admin)
	public List<BoardDTO> nullinquire();

}
