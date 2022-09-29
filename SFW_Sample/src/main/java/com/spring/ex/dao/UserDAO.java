package com.spring.ex.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.ex.dto.UserDTO;

@Repository
public interface UserDAO {
	public List<UserDTO> userlist();
	public void insertUser(String email, String pw, String name, String number, String gender, String birth_date);
	public int loginUser(String email, String pw);
	public List<UserDTO> findname(String email);
	public void updatePw(String email, String pw);
	public void updateOther(String email, String name, String num);
	public int emailChk(String email);

}
