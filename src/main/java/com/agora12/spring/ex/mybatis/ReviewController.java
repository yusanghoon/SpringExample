package com.agora12.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.spring.ex.mybatis.bo.ReviewBO;
import com.agora12.spring.ex.mybatis.model.Review;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	
	// id가 3인 데이터 조회
	@RequestMapping("/mybatis/ex01")
	@ResponseBody
	public Review getReview(
			@RequestParam("id") int id
	//		@RequestParam(value="id" , required=false) int id
	//		@RequestParam(value="id" , defaultValue="3") int id
			) {
		
		
		
		Review review = reviewBO.getReview(id);
		
		return review;
	}
	
}
