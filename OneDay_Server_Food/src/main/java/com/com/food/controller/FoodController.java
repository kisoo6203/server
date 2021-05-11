package com.com.food.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.com.food.model.FoodDTO;
import com.com.food.service.FoodService;
import com.com.food.service.impl.FoodServiceImplV1;

@WebServlet("/menu/*")
public class FoodController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FoodService fService;
	public FoodController() {
		fService = new FoodServiceImplV1();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String subPath = req.getPathInfo();
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		if(subPath.equals("/name")) {
			RequestDispatcher disp 
			= req.getRequestDispatcher("/WEB-INF/views/name.jsp");
			disp.forward(req, resp);
			
		
		} else if(subPath.equals("/all")) {
			List<FoodDTO> foodList = fService.selectAll();
			
		
		} else if(subPath.equals("/input")) {
			
			String mf_date = req.getParameter("mf_date");
			
			req.getRequestDispatcher("/WEB-INF/views/input.jsp").forward(req, resp);
			
			
		} else if(subPath.equals("/search")) {
			
			String mf_name = req.getParameter("mf_name");
			req.getRequestDispatcher("/WEB-INF/views/search.jsp").forward(req, resp);
			
			
		}
	}


	

}
