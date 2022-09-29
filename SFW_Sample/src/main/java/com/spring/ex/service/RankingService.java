package com.spring.ex.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.spring.ex.dto.RankingDTO;

@Repository 
public interface RankingService {
	
	public void insert(Model model);
	
	public void inputrankOk(Model model);

	public List<RankingDTO> benchlist();

	public List<RankingDTO> deadlist();

	public List<RankingDTO> squatlist();

	public List<RankingDTO> totallist();

	public void inputTime(Model model);


}
