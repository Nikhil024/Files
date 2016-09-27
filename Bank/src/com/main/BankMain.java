package com.main;
import java.util.Scanner;

import com.bank.Declarations;
import com.bank.Transactions;
import com.main.*;


public class BankMain extends Declarations{
	public static void main(String[] args) {
		while (ch){
			System.out.println("Welcome to The Bank\nPlease select any one option\n1.Create\n2.Check Balance\n3.Withdraw\n4.Transfer\n5.Exit");
			choice = sc.nextInt();
			sc.next();
			switch(choice){

			case 1:
				System.out.println("Enter you details");
				System.out.println("Enter name\n");
				name = sc.next();
				System.out.println("Enter account type\n1.Premium ");
				acctype = sc.nextInt();
				int balance = 0;
				bank.add(name,acctype,balance);
				

			}

		}
	}
}
