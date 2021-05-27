package com.callor.todo.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqController {

	private static final String prefix = "/WEB-INF/views/";
	private static final String surfix = ".jsp";
	/*
	 * Controller에서 전달받은 jsp 파일을
	 * forwarding 하기 위한 Command method
	 */
	// String String 으로 변수선언된걸 file로 바꿔줌
	public static void forward(HttpServletRequest req, HttpServletResponse resp, String file) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// "/WEB-INF/views/" + file ".jsp" 
		String pasth = String.format("%s%s%s", prefix,file,surfix);
		
		// 작성후 add throws 클릭
		req.getRequestDispatcher(pasth).forward(req, resp);
		
	}

}
