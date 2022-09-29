package com.spring.ex.service;


import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.spring.ex.dto.RegistDTO;



@Repository 
public interface RegistService {
	public void insert(Model model);
	//등록하기
	public void regist(Model model);
	//시작일
	public void start(Model model);
	//만료일
	public void end(Model model);
	//남은일수
	public List<RegistDTO> remainingday(String email);
	
	
}
