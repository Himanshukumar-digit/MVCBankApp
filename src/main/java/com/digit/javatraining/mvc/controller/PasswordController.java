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

@WebServlet("/changePassword")
public class PasswordController extends HttpServlet {
	private Object pstmt;
	private Object con;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int prevPin = Integer.parseInt(req.getParameter("prevPin"));

		int newPin = Integer.parseInt(req.getParameter("newPin"));

		int cnfrmPin = Integer.parseInt(req.getParameter("cnfrmPin"));
		BankApp bnk = new BankApp();
		bnk.setPrevPin(prevPin);
		bnk.setNewPin(newPin);
		bnk.setCnfrmPin(cnfrmPin);
		HttpSession session = req.getSession();

		int ACC_No = (int) session.getAttribute("ACC_No");

		bnk.setACC_No(ACC_No);

		if (newPin == cnfrmPin) {
			boolean b = bnk.changePass();
			System.out.println(b+"b");

			if (b) {
				resp.sendRedirect("/MvcBankApp/ChangePassword.jsp");
			} else {
				resp.sendRedirect("/MvcBankApp/Home.jsp");
			}

		}

	}
}
