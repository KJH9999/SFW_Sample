package com.spring.ex.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.BoardDTO;

@Repository
public class InquireDAOImp implements InquireDAO{

	@Inject
	SqlSession sqlSession;

	@Override
	public void insertBoard(String email, String question) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("question", question);
		
		sqlSession.insert("inquire.insertInquire", map);

	}

	@Override
	public List<BoardDTO> myinqurie(String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);	
		System.out.println(email);
		return sqlSession.selectList("inquire.myinquire", map);
	}

	@Override
	public List<BoardDTO> allinqurie() {
		return sqlSession.selectList("inquire.allinquire");
	}

	@Override
	public void answer(String idx, String answer) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("idx", idx);
		map.put("answer", answer);
		
		System.out.println("DAO : " + idx+ " " +answer);
		
		sqlSession.update("inquire.answer", map);
	}

	@Override
	public List<BoardDTO> nullinqurie() {
		return sqlSession.selectList("inquire.nullinquire");
	}
}
