package com.hexa.sbi_atm.serviceImpl;

import com.hexa.sbi_atm.model.Account;
import com.hexa.sbi_atm.service.AccountService;

public class AccountServiceImpl implements AccountService {
	Account a=new Account();
	@Override
	public void accountOpen() {
		

		a.setFirstName("Pratiksha");
		a.setLastName("Shelke");
		a.setAddress("A/P-Karjune Khare");
		a.setCityName("Nagar");
		a.setAreaName("MIDC");
		a.setPincode(414111);
		a.setMobileNumber(6754234576l);
		a.setAccountType("Saving Account");
		a.setBalance(2000);
		
	System.out.println("Account created Succesfully");
	}

	@Override
	public void balanceCheck() {
	
		System.out.println("Current balance"+a.getBalance());
	
	}

	@Override
	public void withdraw() {
		double i=300;
		 double d=a.getBalance()-i;
		 a.setBalance(d);
System.out.println(" balance after withdrawl   "+a.getBalance());
if(a.getBalance()<=1000)
{
	System.out.println(" your balance is insufficient");	
}
else
{
	System.out.println(" your balance is sufficient");	
}

		
		
	}

	@Override
	public void deposit() {
		double s=3000;
		double c=a.getBalance()+s;
		a.setBalance(c);
		
		System.out.println(" balance after Deposit   "+a.getBalance());


		
	}

	@Override
	public void accountDetails() {
	
		
	System.out.println("Account Details");
		String s=a.getFirstName();
		String s1=a.getLastName();
		String s3=a.getAddress();
		String s4=a.getCityName();
		String s5=a.getAreaName();
		long l=a.getPincode();
		long l1=a.getMobileNumber();
		String s6=a.getAccountType();
		double d=a.getBalance();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(s6);
		System.out.println(d);
	
		
	}
	
	

}
