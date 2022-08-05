package com.hexa.sbi_atm.Controller;

import com.hexa.sbi_atm.service.AccountService;
import com.hexa.sbi_atm.serviceImpl.AccountServiceImpl;

public class AccountController {
	
	public static void main(String[] args) {
System.out.println("main method start");

		AccountService ac=new AccountServiceImpl();
		ac.accountOpen();
		ac.accountDetails();
		ac.balanceCheck();
		ac.withdraw();
		ac.deposit();
System.out.println("main method end");


		
	} 
	

}
