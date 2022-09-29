package com.spring.ex.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAO {

	@Inject
	SqlSession sqlSession;


	@Override
	public List<UserDTO> userlist() {
		return sqlSession.selectList("user.userList");
	}

	@Override
	public void insertUser(String email, String pw, String name, String number, String gender, String birth_date) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("pw", pw);
		map.put("name", name);
		map.put("number", number);
		map.put("gender", gender);
		map.put("birth_date", birth_date);

		System.out.println("DAO" + email + pw + name + number + gender + birth_date);

		sqlSession.insert("user.insertBoard", map);
	}

	@Override
	public int loginUser(String email, String pw) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("pw", pw);

		System.out.println("DAO : " + email + pw);

		sqlSession.selectList("user.login", map);
		if (sqlSession.selectList("user.login", map).equals(sqlSession.selectList("user.forlogin"))) {
			System.out.println(sqlSession.selectList("user.login", map));
			System.out.println(sqlSession.selectList("user.forlogin"));
			System.out.println("O");
			return 1;
		} else {
			System.out.println(sqlSession.selectList("user.login", map));
			System.out.println(sqlSession.selectList("user.forlogin"));
			System.out.println("X");
			return 0;
		}

	}

	@Override
	public List<UserDTO> findname(String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		
		System.out.println(email);
		return sqlSession.selectList("user.findname",map);
	}

	@Override
	public void updatePw(String email, String pw) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);		
		map.put("pw", pw);		
		
		System.out.println(email +pw);
		sqlSession.update("user.updatePw", map);
	}

	@Override
	public void updateOther(String email, String name, String num) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);		
		map.put("name", name);		
		map.put("num", num);		
		
		System.out.println("DAO : " + email +name + num);
		sqlSession.update("user.updateOther", map);		
	}

	@Override
	public int emailChk(String email) {
		int result = sqlSession.selectOne("user.emailChk", email);
		System.out.println("D" + sqlSession.selectOne("user.emailChk", email));
		return result;
	}

}
