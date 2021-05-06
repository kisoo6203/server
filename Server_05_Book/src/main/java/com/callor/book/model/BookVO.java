package com.callor.book.model;

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
public class BookVO {
	
	// table의 칼럼이름과 같은 방식으로 사용하기
	String bk_isbn;
	String bk_title;
	String bk_ccode;
	String bk_acode;
	String bk_date;
	Integer bk_price = 0;
	Integer bk_pages = 0;

}
