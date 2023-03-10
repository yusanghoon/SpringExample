package com.agora12.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.agora12.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {

	// id가 3인 데이터 조회
	public Review selectReview(@Param("id") int id);
	
	public int insertReview(
			@Param("int storeId") int storeId
			, @Param("String menu") String menu
			, @Param("String userName")String userName
			, @Param("double point") double point
			, @Param("String review") String review
			);
	
	
	public int insertReviewByObject(Review review);
	
	
}
