package com.com.food.service;

import java.util.List;

import com.com.food.model.FoodDTO;
import com.com.food.model.FoodVO;
import com.com.food.model.FoodsVO;

public interface FoodService {
	
	// 날짜 입력
	public void insert(FoodVO foodVO);
	
	// view 데이터를 전체 조회
	public List<FoodDTO> selectAll();
	
	// 식품명 검색
	public FoodDTO findByFood(String fo_name);
	
	public void update(FoodDTO foodDTO);
	
	public void delete(String fo_pcode);
	
	
	
	

}
