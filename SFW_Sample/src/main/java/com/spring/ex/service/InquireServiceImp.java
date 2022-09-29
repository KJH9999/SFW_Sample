package com.spring.ex.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.ex.dao.BoardDAO;
import com.spring.ex.dao.InquireDAO;
import com.spring.ex.dto.BoardDTO;

@Service
public class InquireServiceImp implements InquireService{
	@Inject
	InquireDAO inquireDAO;

	@Override
	public void insertInquire(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		String question = request.getParameter("question");
		
		inquireDAO.insertBoard(email,question);
	}

	@Override
	public List<BoardDTO> myinquire(String email) {
		return inquireDAO.myinqurie(email);
	}

	@Override
	public List<BoardDTO> allinquire() {
		return inquireDAO.allinqurie();
	}

	@Override
	public void answer(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String answer = request.getParameter("answer");
		String idx = request.getParameter("idx");
		
		System.out.println("s : " + idx +" " + answer);
		
		inquireDAO.answer(idx,answer);
	}

	@Override
	public List<BoardDTO> nullinquire() {
		return inquireDAO.nullinqurie();
	}


}
