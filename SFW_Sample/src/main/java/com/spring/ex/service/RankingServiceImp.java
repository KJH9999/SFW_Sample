package com.spring.ex.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.ex.dao.RankingDAO;
import com.spring.ex.dto.RankingDTO;

@Service
public class RankingServiceImp implements RankingService{
	@Inject
	RankingDAO rankingDAO;

	@Override
	public void inputrankOk(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		String bench = request.getParameter("bench");
		String dead = request.getParameter("dead");
		String squat = request.getParameter("squat");
		
		rankingDAO.inputrankOk(email,bench,dead,squat);
	}

	@Override
	public void insert(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		
		rankingDAO.insert(email,name);
	}

	@Override
	public List<RankingDTO> benchlist() {
		return rankingDAO.benchlist();
	}

	@Override
	public List<RankingDTO> deadlist() {
		return rankingDAO.deadlist();
		}

	@Override
	public List<RankingDTO> squatlist() {
		return rankingDAO.squatlist();
		}

	@Override
	public List<RankingDTO> totallist() {
		return rankingDAO.totallist();
		}

	@Override
	public void inputTime(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		
		rankingDAO.inputTime(email);
		
	}
	
	
}
