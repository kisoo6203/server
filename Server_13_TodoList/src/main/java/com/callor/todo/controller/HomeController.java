package com.callor.todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.todo.command.ReqCommand;


// HomeCommandImplV1을 생성후 홈컨트롤러는 사용하지 않는다 @@@@@@@@@@@@@@@@@@@@@@

// @WebServlet("/")
public class HomeController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2390118487195951184L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}
	
	

}
