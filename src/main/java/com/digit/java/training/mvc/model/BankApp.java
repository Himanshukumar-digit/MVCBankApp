package com.digit.java.training.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.servlet.http.HttpSession;

public class BankApp {
	int Bank_id;
	String Bank_name;
	String Ifsc_Code;
	int ACC_No;
	int Pin;
	int Cust_id;
	String Customer_name;
	int Balance;
	String Email;
	int Phone;
	int prevPin;
	int newPin;
	int cnfrmPin;
	int choice;
	int lid;
	int tenure;
	String ltype;
	String description;
	int interest;
	int sender_accno;
	int reciever_accno;
	int amount;
	int transaction_id;
	String reciever_ifsc;
	String Ifsc;
	int customer_id;
	int bank_name;
	
	

	private Connection con;
	private PreparedStatement pstmt;
	private Object resp;
	private ResultSet resultSet;
	private ResultSet res1;
	private ResultSet res2;
	private ResultSet res3;

	/**
	 * 
	 */
	public BankApp() {
		// Store the database connection code.
		String url = "jdbc:mysql://localhost:3306/banking";

		String user = "root";

		String pwd = "root";

		// Database connection

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, pwd);

		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}

	/**
	 * @return the bank_id
	 */
	public int getBank_id() {
		return Bank_id;
	}

	/**
	 * @param bank_id the bank_id to set
	 */
	public void setBank_id(int bank_id) {
		Bank_id = bank_id;
	}

	/**
	 * @return the bank_name
	 */
	public String getBank_name() {
		return Bank_name;
	}

	/**
	 * @param bank_name the bank_name to set
	 */
	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}

	/**
	 * @return the ifsc_Code
	 */
	public String getIfsc_Code() {
		return Ifsc_Code;
	}

	/**
	 * @param ifsc_Code the ifsc_Code to set
	 */
	public void setIfsc_Code(String ifsc_Code) {
		Ifsc_Code = ifsc_Code;
	}

	/**
	 * @return the aCC_No
	 */
	public int getACC_No() {
		return ACC_No;
	}

	/**
	 * @param aCC_No the aCC_No to set
	 */
	public void setACC_No(int aCC_No) {
		ACC_No = aCC_No;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return Pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(int pin) {
		Pin = pin;
	}

	/**
	 * @return the cust_id
	 */
	public int getCust_id() {
		return Cust_id;
	}

	/**
	 * @param cust_id the cust_id to set
	 */
	public void setCust_id(int cust_id) {
		Cust_id = cust_id;
	}

	/**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return Customer_name;
	}

	/**
	 * @param customer_name the customer_name to set
	 */
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return Balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		Balance = balance;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the phone
	 */
	public int getPhone() {
		return Phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		Phone = phone;
	}

	/**
	 * @return the prevPin
	 */
	public int getPrevPin() {
		return prevPin;
	}

	/**
	 * @param prevPin the prevPin to set
	 */
	public void setPrevPin(int prevPin) {
		this.prevPin = prevPin;
	}

	/**
	 * @return the newPin
	 */
	public int getNewPin() {
		return newPin;
	}

	/**
	 * @param newPin the newPin to set
	 */
	public void setNewPin(int newPin) {
		this.newPin = newPin;
	}

	/**
	 * @return the cnfrmPin
	 */
	public int getCnfrmPin() {
		return cnfrmPin;
	}

	/**
	 * @param cnfrmPin the cnfrmPin to set
	 */
	public void setCnfrmPin(int cnfrmPin) {
		this.cnfrmPin = cnfrmPin;
	}

	/**
	 * @return the lid
	 */
	public int getLid() {
		return lid;
	}

	/**
	 * @param lid the lid to set
	 */
	public void setLid(int lid) {
		this.lid = lid;
	}

	/**
	 * @return the tenure
	 */
	public int getTenure() {
		return tenure;
	}

	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	/**
	 * @return the ltype
	 */
	public String getLtype() {
		return ltype;
	}

	/**
	 * @param ltype the ltype to set
	 */
	public void setLtype(String ltype) {
		this.ltype = ltype;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the interest
	 */
	public int getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(int interest) {
		this.interest = interest;
	}

	/**
	 * @return the sender_accno
	 */
	public int getSender_accno() {
		return sender_accno;
	}

	/**
	 * @param sender_accno the sender_accno to set
	 */
	public void setSender_accno(int sender_accno) {
		this.sender_accno = sender_accno;
	}

	/**
	 * @return the reciever_accno
	 */
	public int getReciever_accno() {
		return reciever_accno;
	}

	/**
	 * @param reciever_accno the reciever_accno to set
	 */
	public void setReciever_accno(int reciever_accno) {
		this.reciever_accno = reciever_accno;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the transaction_id
	 */
	public int getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the reciever_ifsc
	 */
	public String getReciever_ifsc() {
		return reciever_ifsc;
	}

	/**
	 * @param reciever_ifsc the reciever_ifsc to set
	 */
	public void setReciever_ifsc(String reciever_ifsc) {
		this.reciever_ifsc = reciever_ifsc;
	}

	/**
	 * @return the ifsc
	 */
	public String getIfsc() {
		return Ifsc;
	}

	/**
	 * @param ifsc the ifsc to set
	 */
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}

	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @param bank_name the bank_name to set
	 */
	public void setBank_name(int bank_name) {
		this.bank_name = bank_name;
	}

	public boolean register() {
		try {

			pstmt = con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?,?)");

			pstmt.setInt(1, Bank_id);

			pstmt.setString(2, Bank_name);

			pstmt.setString(3, Ifsc_Code);

			pstmt.setInt(4, ACC_No);

			pstmt.setInt(5, Pin);

			pstmt.setInt(6, Cust_id);

			pstmt.setString(7, Customer_name);

			pstmt.setInt(8, Balance);

			pstmt.setString(9, Email);

			pstmt.setInt(10, Phone);

			int x = pstmt.executeUpdate();

			if (x > 0) {
				return true;

				// resp.sendRedirect("/Banking_Application/RegisterSuccess.html");

			}

			else {
				return false;

				// resp.sendRedirect("/Banking_Application/RegisterFail.html");

			}

		}

		catch (Exception e) {

			e.printStackTrace();

		}
		return false;

	}

	public boolean login() {

		try {

			pstmt = con.prepareStatement("select * from register where Cust_id = ? and Pin = ?");

			pstmt.setInt(1, Cust_id);

			pstmt.setInt(2, Pin);
			ResultSet x1 = pstmt.executeQuery();

			if (x1.next()) {
				this.setACC_No(x1.getInt("ACC_No"));
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return false;

	}

	public boolean changePass() {
		try {

			pstmt = con.prepareStatement("update register set Pin = ? where ACC_No = ?");

			pstmt.setInt(1, newPin);
			System.out.println(getNewPin());
			pstmt.setInt(2, getACC_No());
			System.out.println(getACC_No());

			// pstmt.setInt(2, (int) session.getAttribute("ACC_No"));

			int x = pstmt.executeUpdate();
			System.out.println(x + "x");
			// resp.sendRedirect("/Banking_Application/ChangePassword.jsp");

			if (x > 0) {
				return true;

				// resp.sendRedirect("/Banking_Application/home.jsp");

			} else {
				return false;
			}

		} catch (Exception e) {

			// TODO: handle exception

			e.printStackTrace();

//            writer.write();

		}
		return false;
	}

	public boolean checkBalance() {
		try {

			pstmt = con.prepareStatement("Select  Balance from Register where ACC_No=?");

			pstmt.setInt(1, ACC_No);

			resultSet = pstmt.executeQuery();
			if (resultSet.next() == true) {
				this.setBalance(resultSet.getInt("Balance"));
				return true;
				// resp.sendRedirect("/Banking_Application/Balance.jsp");

			} else {
				// resp.sendRedirect("/Banking_Application/BalanceFail.jsp");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean ApplyLoan(int choice) {
		try {

			pstmt = con.prepareStatement("Select * from loan where lid=?");
			pstmt.setInt(1, choice);
			resultSet = pstmt.executeQuery();
			if (resultSet.next() == true) {
				this.setLid(resultSet.getInt("lid"));
				this.setLtype(resultSet.getString("ltype"));
				this.setTenure(resultSet.getInt("tenure"));
				this.setInterest(resultSet.getInt("interest"));
				this.setDescription(resultSet.getString("description"));
				return true;
				// resp.sendRedirect("/Banking_Application/LoanDetails.jsp");

			} else {
				return false;
				// resp.sendRedirect("/Banking_Application/LoanFail.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean TransferStatus() {
		try {

			

			pstmt = con.prepareStatement("select * from Register where Cust_id=? and Ifsc_Code=? and ACC_No=?");

			pstmt.setInt(1, customer_id);
			pstmt.setString(2, Ifsc);

			pstmt.setInt(3, sender_accno);

			res1 = pstmt.executeQuery();

			if (res1.next() == true) {
				pstmt = con.prepareStatement("Select * from register where Ifsc_Code=? and ACC_No=? ");
				pstmt.setString(1, reciever_ifsc);
				pstmt.setInt(2, reciever_accno);
				res2 = pstmt.executeQuery();

				if (res2.next() == true) {
					pstmt = con.prepareStatement("Select Balance From register where ACC_No=? ");
					pstmt.setInt(1, sender_accno);
					res3 = pstmt.executeQuery();
					res3.next();
					int Balance = res3.getInt(1);
					if (Balance > amount) {
						pstmt = con.prepareStatement("Update Register set Balance=Balance-? where ACC_No=? ");
						pstmt.setInt(1, amount);
						pstmt.setInt(2, sender_accno);
						int x1 = pstmt.executeUpdate();
						if (x1 > 0) {
							pstmt = con.prepareStatement("Update register set Balance = Balance+? where ACC_No=?");
							pstmt.setInt(1, amount);
							pstmt.setInt(2, reciever_accno);
							int x2 = pstmt.executeUpdate();
							if (x2 > 0) {
								pstmt = con.prepareStatement("Insert into transfers values(?,?,?,?,?,?,?,?)");
								pstmt.setInt(1, customer_id);
								pstmt.setString(2, Bank_name);
								pstmt.setString(3, Ifsc);
								pstmt.setInt(4, sender_accno);
								pstmt.setString(5, reciever_ifsc);

								pstmt.setInt(6, reciever_accno);

								pstmt.setInt(7, amount);

								Random r = new Random(System.currentTimeMillis());

								int t_id = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));

								pstmt.setInt(8, t_id);

								int x3 = pstmt.executeUpdate();
								if (x3 > 0) {
									//resp.sendRedirect("/Banking_Application/transfersuccess.jsp");
								} else {
									//resp.sendRedirect("/Banking_Application/fail.jsp");
								}

							} else {
								// x2
							}

						} else {
							// x1
						}

					}

				}
			}
		}

		catch (Exception e) {

			e.printStackTrace();

		}

		return false;
	}
}
