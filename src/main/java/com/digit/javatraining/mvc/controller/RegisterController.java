package com.digit.javatraining.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.java.training.mvc.model.BankApp;
@WebServlet("/Register")
public class RegisterController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Creating Object for the bankapp
		BankApp bnk = new BankApp();
		int Bank_id = Integer.parseInt(req.getParameter("Bank_id"));

		String Bank_name = req.getParameter("Bank_name");

		String Ifsc_code = req.getParameter("Ifsc_code");

		int ACC_no = Integer.parseInt(req.getParameter("ACC_no"));

		int Pin = Integer.parseInt(req.getParameter("Pin"));

		int Cust_id = Integer.parseInt(req.getParameter("Cust_id"));

		String Customer_name = req.getParameter("Customer_name");

		int Balance = Integer.parseInt(req.getParameter("Balance"));

		String Email = req.getParameter("Email");
		int Phone = Integer.parseInt(req.getParameter("Phone"));
		bnk.setBank_id(Bank_id);
		bnk.setBank_name(Bank_name);
		bnk.setIfsc_Code(Ifsc_code);
		bnk.setCustomer_name(Customer_name);
		bnk.setPin(Pin);
		bnk.setPhone(Phone);
		bnk.setEmail(Email);
		bnk.setACC_No(ACC_no);
		bnk.setBalance(Balance);
		bnk.setCust_id(Cust_id);
		
		boolean b=bnk.register();
		if(b) {
			resp.sendRedirect("/MvcBankApp/RegisterSuccess.html");
		}
		else {
			resp.sendRedirect("/MvcBankApp/RegisterFail.html");
		}
		

	}

}
