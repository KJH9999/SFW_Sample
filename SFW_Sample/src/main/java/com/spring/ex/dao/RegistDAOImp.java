package com.spring.ex.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.RankingDTO;
import com.spring.ex.dto.RegistDTO;

@Repository
public class RegistDAOImp implements RegistDAO{
	@Inject
	SqlSession sqlSession;

	@Override
	public void insert(String email, String name) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("name", name);
		sqlSession.insert("regist.insert", map);
	}

	@Override
	public void regist(String email, String slct, String pay) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("slct", slct);
		map.put("pay", pay);
		
		System.out.println(email+slct+pay);
		
		sqlSession.update("regist.regist", map);
	}

	@Override
	public void start(String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		
		sqlSession.update("regist.start", map);
	}

	@Override
	public void end(String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		
		sqlSession.update("regist.end", map);
	}

	@Override
	public List<RegistDTO> remainingday(String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		
		return sqlSession.selectList("regist.remainingday");
	}

}
