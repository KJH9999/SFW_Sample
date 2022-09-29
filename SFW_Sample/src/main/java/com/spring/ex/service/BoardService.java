package com.spring.ex.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.spring.ex.dto.BoardDTO;
import com.spring.ex.dto.UserDTO;

@Repository 
public interface BoardService {
	
	//글쓰기
	public void insertBoard(Model model);
	//list
	public List<BoardDTO> boardList();
	//상세
	public List<BoardDTO> read(int idx);
	//조회수 증가
	void increaseViewcnt(int idx);
	//게시글 삭제
	public void delete(int idx);

}
