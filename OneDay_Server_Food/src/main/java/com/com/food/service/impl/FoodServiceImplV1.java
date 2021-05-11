package com.com.food.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.com.food.model.FoodDTO;
import com.com.food.model.FoodVO;
import com.com.food.model.FoodsVO;
import com.com.food.persistence.DBContract;
import com.com.food.service.FoodService;

public class FoodServiceImplV1 implements FoodService {

	protected Connection dbConn;
	public FoodServiceImplV1() {
		this.dbConn = DBContract.getDBConnection();
	}
	@Override
	public void insert(FoodVO foodVO) {
		// TODO 식품정보 추가
		String sql = "INSERT INTO" + "tbl_foods";
		sql += "(mf_seq, mf_date, mf_fcode, mf_eat)";
		sql += "VALUES(?,?,?,?)";
		System.out.println(sql);
		
		PreparedStatement pStr = null;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, foodVO.getMf_date());
			pStr.setString(2, foodVO.getMf_fcode());
			pStr.setInt(3, foodVO.getMf_eat());
			pStr.executeUpdate();
			pStr.close();
			System.out.println("인서트 완료");			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("인서트 오류");
		}
		
	}

	@Override
	public List<FoodDTO> selectAll() {
		// TODO 전체 식품정보 조회
		String sql = " SELECT * FROM view_식품정보 ";
		
		PreparedStatement pStr = null;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public FoodDTO findByFood(String fo_name) {
		// TODO 식품명을 검색하여 선택 후 섭취량 등록
		PreparedStatement pStr = null;
		String sql = "SELECT * FROM view_식품정보 WHERE NAME ='"
				+  fo_name + "'";
		
		try {
			pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			if(result.next()) {
				FoodDTO foodDTO = new FoodDTO();
				foodDTO.setFo_pcode(result.getString("식품코드"));
				foodDTO.setFo_name(result.getString("식품명"));
				foodDTO.setFo_date(result.getString("제조년도"));
				foodDTO.setCo_comp(result.getString("제조사"));
				foodDTO.setIt_kinds(result.getString("분류명"));
				foodDTO.setFo_offer(result.getInt("1회제공량"));
				foodDTO.setFo_gram(result.getInt("총내용량"));
				foodDTO.setFo_kcal(result.getInt("칼로리"));
				foodDTO.setFo_protain(result.getInt("단백질"));
				foodDTO.setFo_fat(result.getInt("지방"));
				foodDTO.setFo_carb(result.getInt("탄수화물"));
				foodDTO.setFo_sugars(result.getInt("당류"));
				return foodDTO;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	@Override
	public void update(FoodDTO foodDTO) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(String fo_pcode) {
		// TODO Auto-generated method stub
		
	}
	

}
