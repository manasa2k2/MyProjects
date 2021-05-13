package com.details;

import java.util.Scanner;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.Account;
import com.bank.Customer;
import com.bank.Loan;

public class CustMain {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Customer c = (Customer)ac.getBean("bank1");
		System.out.println("Enter your Details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		c.setCustId(sc.nextInt());
		System.out.println("Enter your name");
		c.setCustName(sc.next());
		
		System.out.println("Enter your Phone Number");
		c.setPhoneNumber(sc.next());
		System.out.println("Enter your balance");
		c.setBlanace(sc.nextFloat());
		Account a = (Account)ac.getBean("account1");
		System.out.println("Enter Account no and type");
		a.setAccNo(sc.next());
		a.setAccType(sc.next());
		Account a1 = (Account)ac.getBean("account2");
		System.out.println("Enter Account no and type");
		a1.setAccNo(sc.next());
		a1.setAccType(sc.next());
		Loan l = (Loan)ac.getBean("loan");
		System.out.println("Enter your locan details");
		System.out.println("loan Id");
		l.setlId(sc.nextInt());
		System.out.println("loan type");
		l.setType(sc.next());
		Loan l1 = (Loan)ac.getBean("loan");
		System.out.println("Enter your loan details");
		System.out.println("loan Id");
		l1.setlId(sc.nextInt());
		System.out.println("loan type");
		l1.setType(sc.next());	
		c.dispDetails();

	}

}
