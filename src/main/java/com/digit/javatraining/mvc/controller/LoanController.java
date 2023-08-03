package com.digit.javatraining.mvc.controller;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.java.training.mvc.model.BankApp;
@WebServlet("/loan")
public class LoanController extends HttpServlet {
	private Object con;
	private Object pstmt;
	private Object resultSet;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int choice = Integer.parseInt(req.getParameter("choice"));
		HttpSession session = req.getSession();
		BankApp bnk = new BankApp();
		
		boolean b = bnk.ApplyLoan(choice);
		session.setAttribute("lid", bnk.getLid());
		session.setAttribute("ltype", bnk.getLtype());
		session.setAttribute("tenure", bnk.getTenure());
		session.setAttribute("interest", bnk.getInterest());
		session.setAttribute("description", bnk.getDescription());
		if(b) {
			resp.sendRedirect("/MvcBankApp/LoanDetails.jsp");
		}
		else {
			resp.sendRedirect("/MvcBankApp/LoanFail.jsp");
		}
	}

}
