package com.agora12.spring.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agora12.spring.ex.jsp.dao.NewUserDAO;
import com.agora12.spring.ex.jsp.model.NewUser;

@Service
public class NewUserBO {

	@Autowired
	private NewUserDAO newUserDAO;	
	
	public NewUser getLastUser() {
		
		return newUserDAO.selectLastUser();
		
	}
	
	
	public int addUser(String name
			, String birthday
			, String email
			, String introduce) {
		
		return newUserDAO.insertUser(name, birthday, email, introduce);
		
	}
	
	
	public int addUserByObject(NewUser user) {
		return newUserDAO.insertUserByObject(user);
	}
	
	
}
