package com.callor.welcom.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kisoo") // 도메인 마지막 적는 부분
public class BookController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter out = resp.getWriter();
//			out.println("this is book Controller");
//			out.print("<a href='");
//			out.print("http://localhost");
//			out.print(":8080");
//			out.println("/welcom/home'>");
			out.print("내일 밥 겁나 궁금할땐? >> ");
			out.println("<a href=https://www.edupoll.net/community/?main=freeBoard&bbs=freeBoard&b=20&m=v&i=21&p=1>");
			out.println("밥 묵쟈 닷컴</a>");
			
			out.close();
	}
	
	

}
