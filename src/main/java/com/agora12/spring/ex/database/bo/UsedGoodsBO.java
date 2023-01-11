package com.agora12.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agora12.spring.ex.database.dao.UsedGoodsDAO;
import com.agora12.spring.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBO {

	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	
	//Used_goods 테이블을 전체 데이터 조회
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList ;
	}
	
}
