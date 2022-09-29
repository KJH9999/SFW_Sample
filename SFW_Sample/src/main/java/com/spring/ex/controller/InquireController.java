package com.spring.ex.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.ex.dto.BoardDTO;
import com.spring.ex.service.InquireService;

@Controller
public class InquireController {
	@Inject
	InquireService inquireService;

	@RequestMapping("inquire")
	public String inquire(@RequestParam String email, Model model) {
		System.out.println("inquire()");
		System.out.println(email);
		List<BoardDTO> myinquire = inquireService.myinquire(email);
		model.addAttribute("myinquire", myinquire);
		return "inquire";
	}

	@RequestMapping("writeinquire")
	public String writeinquire(Model model) {
		System.out.println("writeinquire()");
		return "writeinquire";
	}

	@RequestMapping("writeinquireOk")
	public String writeinquireOk(HttpServletRequest request, Model model) {
		System.out.println("writeinquireOk()");
		model.addAttribute("request", request);
		inquireService.insertInquire(model);
		return "inquire";
	}

}
