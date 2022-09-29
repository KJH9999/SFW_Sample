package com.spring.ex.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.ex.dto.RegistDTO;


@Repository
public interface RegistDAO {
	public void insert(String email, String name);
	//등록하기
	public void regist(String email, String slct, String pay);
	//시작일
	public void start(String email);
	//만료일
	public void end(String email);
	//남은일수
	public List<RegistDTO> remainingday(String email);

}
