package com.spring.ex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.BoardDTO;
import com.spring.ex.dto.UserDTO;

@Repository
public class BoardDAOImp implements BoardDAO{

	@Inject
	SqlSession sqlSession;

	@Override
	public void insertBoard(String email, String title, String content, String hit) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("title", title);
		map.put("content", content);
		map.put("hit", hit);

		System.out.println("DAO" + email + title + content + hit);

		sqlSession.insert("board.insertBoard", map);
	}

	@Override
	public List<BoardDTO> boardlist() {
		return sqlSession.selectList("board.boardlist");
	}

	@Override
	public void increaseHit(int idx) {
		sqlSession.update("board.increaseView",idx);
	}

	@Override
	public List<BoardDTO> read(int idx) {
		System.out.println(idx);
		System.out.println(sqlSession.selectList("board.read", idx));
		return sqlSession.selectList("board.read", idx);
	}

	@Override
	public void delete(int idx) {
		sqlSession.delete("board.delete", idx);
	}



}
