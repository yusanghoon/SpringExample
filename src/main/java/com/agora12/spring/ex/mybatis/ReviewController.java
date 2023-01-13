package com.agora12.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.spring.ex.mybatis.bo.ReviewBO;
import com.agora12.spring.ex.mybatis.model.Review;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	
	// id가 3인 데이터 조회
	@RequestMapping("ex01")
	@ResponseBody
	public Review getReview(
			@RequestParam("id") int id
	//		@RequestParam(value="id" , required=false) int id
	//		@RequestParam(value="id" , defaultValue="3") int id
			) {
	
		
		Review review = reviewBO.getReview(id);
		
		return review;
	}
	
	@RequestMapping("ex02")	
	@ResponseBody
	public String addReview() {
		
	int count = reviewBO.addReview(4, "콤비네이션피자", "김인규", 4.5, "할인도 많이 받고 잘먹었습니다.");
	
	Review reivew = new Review();	
	reivew.setStoreId(2);	
	reivew.setMenu("뿌링클");	
	reivew.setUserName("김인규");	

	return "삽입결과" + count;
	}
	
	
	
}
