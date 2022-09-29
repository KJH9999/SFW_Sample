package com.spring.ex.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.ex.dao.BoardDAO;
import com.spring.ex.dao.UserDAO;
import com.spring.ex.dto.BoardDTO;
import com.spring.ex.dto.UserDTO;

@Service
public class BoardServiceImp implements BoardService{

	@Inject
	BoardDAO boardDAO;

	@Override
	public void insertBoard(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String hit = request.getParameter("hit");
		
		System.out.println("S"+email+title+content+hit);
		
		boardDAO.insertBoard(email,title,content,hit);
	}

	@Override
	public List<BoardDTO> boardList() {
		return boardDAO.boardlist();
	}

	@Override
	public void increaseViewcnt(int idx) {
		boardDAO.increaseHit(idx);
	}

	@Override
	public List<BoardDTO> read(int idx) {
		System.out.println("read > s = "+idx);
		return boardDAO.read(idx);
	}

	@Override
	public void delete(int idx) {
		boardDAO.delete(idx);
	}


}
