package exammvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exammvc.model.MinService;

public class MinHandler implements CommandHandler {
	
	private MinService minService = new MinService();
	
	@Override
	public String handlerAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		int result = minService.min(n1, n2);
		
		request.setAttribute("result", result);
		
		return "/WEB-INF/min.jsp";
	}

}
