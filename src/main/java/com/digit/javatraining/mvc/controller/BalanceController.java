package com.digit.javatraining.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.java.training.mvc.model.BankApp;
@WebServlet("/CheckBalance")
public class BalanceController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		BankApp bnk = new BankApp();
		int ACC_No = (int)session.getAttribute("ACC_No");
		bnk.setACC_No(ACC_No);
		
		boolean b = bnk.checkBalance();
		session.setAttribute("Balance", bnk.getBalance());
		if(b) {
			resp.sendRedirect("/MvcBankApp/Balance.jsp");
			
		}
		else {
			resp.sendRedirect("/MvcBankApp//BalanceFail.jsp");
		}
		
	}

}
