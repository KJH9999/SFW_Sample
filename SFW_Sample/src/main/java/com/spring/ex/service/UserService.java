package com.spring.ex.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.spring.ex.dto.UserDTO;

@Repository 
public interface UserService {

	//list뽑기
	public List<UserDTO> userlist();
	// 회원 가입
	public void insertUser(Model model);
	//로그인
	public int loginUser(Model model);
	//로그아웃X
	//이름찾기
	public List<UserDTO> findname(String email);
	//비번수정
	public void updatePw(Model model);
	//정보수정
	public void updateOther(Model model);
	
	public int emailChk(String email);
	
	
	
}
