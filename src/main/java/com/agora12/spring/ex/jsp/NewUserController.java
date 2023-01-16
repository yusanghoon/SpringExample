package com.agora12.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.spring.ex.jsp.bo.NewUserBO;
import com.agora12.spring.ex.jsp.model.NewUser;

@Controller
@RequestMapping("/jsp/user")
public class NewUserController {

	
	@Autowired
	private NewUserBO newUserBO;
	
	@GetMapping("/lastuser")
	public String lastUser(Model model) {
		
		NewUser lastUser = newUserBO.getLastUser();
		model.addAttribute("user", lastUser);
		model.addAttribute("title", "최근 사용자");
		
		
		return "jsp/last";
		
	}
	
//	@RequestMapping(path="/add", method=RequestMethod.POST)
	@PostMapping("/add")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("email") String email
			, @RequestParam("introduce") String introduce) {
		
		int count =  newUserBO.addUser(name, birthday, email, introduce);
		
		return "삽입결과 : " + count;		
				
	}
	
	@GetMapping("/input")
	public String userInput() {
		return "jsp/userinput";	
		
	}
	
	
	
	
	
}
