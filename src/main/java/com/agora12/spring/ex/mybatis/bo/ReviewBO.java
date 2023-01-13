package com.agora12.spring.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.spring.ex.mybatis.dao.ReviewDAO;
import com.agora12.spring.ex.mybatis.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO;
	
	//id가 3인 데이터 조회

	public Review getReview(int id) {
		
		Review review = reviewDAO.selectReview(id);
		
		return review;
	}
	
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		
	    return reviewDAO.insertReview(storeId, menu, userName, point, review);
		
	}
	
	public int addReviewbyObject(Review review) {
		
		reviewDAO.insertReview
		
	}
	
}
