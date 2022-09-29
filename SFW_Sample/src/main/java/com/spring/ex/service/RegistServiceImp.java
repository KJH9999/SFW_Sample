package com.spring.ex.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.ex.dao.RegistDAO;
import com.spring.ex.dto.RegistDTO;

@Service
public class RegistServiceImp implements RegistService{

	@Inject
	RegistDAO registDAO;

	@Override
	public void insert(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		
		registDAO.insert(email,name);
	}

	@Override
	public void regist(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		String slct = request.getParameter("slct");
		String pay = request.getParameter("pay");
		
		System.out.println(email+slct+pay);
		
		registDAO.regist(email,slct,pay);
		
	}

	@Override
	public void start(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		
		registDAO.start(email);
	}

	@Override
	public void end(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String email = request.getParameter("email");
		
		registDAO.end(email);
	}

	@Override
	public List<RegistDTO> remainingday(String email) {
		return registDAO.remainingday(email);
	}


}
