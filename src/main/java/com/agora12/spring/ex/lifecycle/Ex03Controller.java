package com.agora12.spring.ex.lifecycle;

import org.springframework.web.bind.annotation.RequestMapping;

public class Ex03Controller {

	@RequestMapping("/lifecycle/02")
	public String jspResponse() {
		return "lifecycle/ex02";
	}
	
}
