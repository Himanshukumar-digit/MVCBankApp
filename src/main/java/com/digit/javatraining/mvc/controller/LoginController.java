package com.digit.javatraining.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.java.training.mvc.model.BankApp;
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cust_id = Integer.parseInt(req.getParameter("Cust_id"));
		int pin = Integer.parseInt(req.getParameter("Pin"));
		BankApp bnk = new BankApp();
	
		bnk.setCust_id(cust_id);

		bnk.setPin(pin);

		boolean b = bnk.login();
		HttpSession session = req.getSession(true);
		session.setAttribute("ACC_No", bnk.getACC_No());
		
		if (b) {
			session.setAttribute("Customer_name", bnk.getCustomer_name());
			resp.sendRedirect("/MvcBankApp/Home.jsp");

		}

		else {

			resp.sendRedirect("/MvcBankApp/LoginFail.html");

		}

	}

}
