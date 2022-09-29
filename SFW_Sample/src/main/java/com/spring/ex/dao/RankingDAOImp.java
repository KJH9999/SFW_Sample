package com.spring.ex.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.RankingDTO;

@Repository
public class RankingDAOImp implements RankingDAO{
	@Inject
	SqlSession sqlSession;

	@Override
	public void inputrankOk(String email, String bench, String dead, String squat) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("bench", bench);
		map.put("dead", dead);
		map.put("squat", squat);
		
		sqlSession.update("ranking.input", map);
	}

	@Override
	public void insert(String email, String name) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("name", name);
		sqlSession.insert("ranking.insert", map);
	}

	@Override
	public List<RankingDTO> benchlist() {
		return sqlSession.selectList("ranking.benchlist");
	}

	@Override
	public List<RankingDTO> deadlist() {
		return sqlSession.selectList("ranking.deadlist");
	}

	@Override
	public List<RankingDTO> squatlist() {
		return sqlSession.selectList("ranking.squatlist");
	}

	@Override
	public List<RankingDTO> totallist() {
		return sqlSession.selectList("ranking.totallist");
	}

	@Override
	public void inputTime(String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		
		sqlSession.update("ranking.inputTime", map);
	}
	
}
