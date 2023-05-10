package exammvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exammvc.model.MulService;

public class MulHandler implements CommandHandler {
	
	private MulService mulService = new MulService();
	
	@Override
	public String handlerAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		int result = mulService.mul(n1, n2);
		
		request.setAttribute("result", result);
		
		return "/WEB-INF/mul.jsp";
	}

}
