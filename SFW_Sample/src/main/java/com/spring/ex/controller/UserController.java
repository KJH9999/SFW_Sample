package com.spring.ex.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.bytecode.analysis.Analyzer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ex.dto.RegistDTO;
import com.spring.ex.dto.UserDTO;
import com.spring.ex.service.RankingService;
import com.spring.ex.service.RegistService;
import com.spring.ex.service.UserService;

@Controller
public class UserController {

	@Inject
	UserService userService;

	@Inject
	RegistService registService;
	
	@Inject
	RankingService rankingService;

	/*
	 * @RequestMapping("userlist") public String userlist(Model model) {
	 * System.out.println("UserService = " + userService); List<UserDTO> userlist =
	 * userService.userlist(); model.addAttribute("userlist", userlist); return
	 * "user_list"; }
	 */
	

	@RequestMapping(value = "/login/ex01", method = { RequestMethod.GET })
    public String ex01(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
        System.out.println("ckck");
		return "login/ex01";
	}
	
	@RequestMapping("emailCk")
	@ResponseBody 
	public int idcheck(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String email) {
	    int result = userService.emailChk(req.getParameter("email"));
	    System.out.println(result);
	    return result; 
	}
	
	@RequestMapping("home")
	public String homew(Model model) {
		return "home";
	}

	@RequestMapping("pay")
	public String pay(Model model) {
		return "pay";
	}
	
	@RequestMapping("login")
	public String login(Model model) {
		return "login";
	}

	// 로그인 세션기능 추가
	@RequestMapping("loginOk")
	public String loginOk(HttpServletRequest request, Model model) {

		HttpSession session = request.getSession();
		System.out.println("login()");
		String email = request.getParameter("email");
		System.out.println("loginOK: "+ email);
		
		List<UserDTO> userlist = userService.findname(email);
		List<RegistDTO> day = registService.remainingday(email);
		
		model.addAttribute("request", request);
		model.addAttribute("userlist", userlist);
		model.addAttribute("day", day);

		int ck = userService.loginUser(model);
		System.out.println(ck);
		if (ck != 0) {
			System.out.println("ok");
			session.setAttribute("email", email);
			System.out.println("세션설정O");
			return "loginok";
		} else {
			System.out.println("no");
			return "home";
		}

	}

	@RequestMapping("join")
	public String join(Model model) {
		return "join";
	}

	@RequestMapping("joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		System.out.println("write()");
		model.addAttribute("request", request);
		userService.insertUser(model);
		rankingService.insert(model);
		registService.insert(model);
		return "home";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session, Model model) {
		System.out.println("logout()");
		session.invalidate();
		return "home";
	}
	
	@RequestMapping("update")
	public String update(HttpSession session, Model model) {
		return "update";
	}
	
	@RequestMapping("update_pw")
	public String update_pw(HttpSession session, Model model) {
		return "update_pw";
	}
	
	@RequestMapping("update_other")
	public String update_other(HttpSession session, Model model) {
		return "update_other";
	}
	
	@RequestMapping("updatePwOk")
	public String update_pwOk(HttpServletRequest request, Model model) {				
		HttpSession session = request.getSession();
		System.out.println("update_pwOk()");
		model.addAttribute("request", request);
		userService.updatePw(model); 
		session.invalidate();
		return "home";
	}
	
	@RequestMapping("updateOtherOk")
	public String update_otherOK(HttpServletRequest request, Model model) {
		System.out.println("updateOtherOk()");
		model.addAttribute("request", request);
		userService.updateOther(model);
		return "loginok";	
	}

	//regist
	@RequestMapping("regist")
	public String regist(HttpServletRequest request,Model model) {
		System.out.println("regist()");
		return "regist";
	}
	
	@RequestMapping("registOk")
	public String registOk(HttpServletRequest request,Model model) {
		System.out.println("registOk()");
		model.addAttribute("request", request);
		registService.regist(model);
		registService.start(model);
		registService.end(model);
		return "home";
	}
	
	@RequestMapping("join3")
	public String join3(HttpServletRequest request,Model model) {
		System.out.println("join3()");
		return "join3";
	}
	

}
