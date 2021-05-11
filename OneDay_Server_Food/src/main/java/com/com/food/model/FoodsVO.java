package com.com.food.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FoodsVO {
	
	private String fo_pcode;
	private String fo_name;
	private String fo_date;
	private String fo_ccode;
	private String fo_tcode;
	private Integer fo_offer = 0;
	private Integer fo_gram = 0;
	private Integer fo_kcal = 0;
	private Integer fo_protain = 0;
	private Integer fo_fat = 0;
	private Integer fo_carb = 0;
	private Integer fo_sugars = 0;

}
