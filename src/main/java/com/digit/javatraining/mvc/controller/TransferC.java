package com.digit.javatraining.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.java.training.mvc.model.BankApp;
@WebServlet("/transfer")
public class TransferC extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String Bank_name = req.getParameter("Bank_name");

		String Ifsc = req.getParameter("Ifsc");

		int customer_id = Integer.parseInt(req.getParameter("customer_id"));

		int Sender_accno = Integer.parseInt(req.getParameter("sender_accno"));

		int Reciever_accno = Integer.parseInt(req.getParameter("reciever_accno"));

		String Reciever_Ifsc = req.getParameter("reciever_Ifsc");

		int Amount = Integer.parseInt(req.getParameter("amount"));
		BankApp bnk = new BankApp();
		bnk.setBank_name(Bank_name);
		bnk.setIfsc(Ifsc);
		bnk.setCustomer_id(customer_id);
		bnk.setSender_accno(Sender_accno);
		bnk.setReciever_accno(Reciever_accno);
		bnk.setReciever_ifsc(Reciever_Ifsc);
		bnk.setAmount(Amount);
		boolean b = bnk.TransferStatus();
		if(b) {
			resp.sendRedirect("/Banking_Application/transfersuccess.jsp");
		}
		else {
			resp.sendRedirect("/Banking_Application/fail.jsp");
		}
		
	}

}
