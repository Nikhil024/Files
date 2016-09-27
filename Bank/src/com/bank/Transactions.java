package com.bank;

import java.util.Scanner;

public class Transactions {
	
Scanner sc = new Scanner(System.in);

public void create_user(String name, double amount, double balance){
	if(gs.getAccountno() == 0){
		gs.setAccountno(1);
	}
	else{
	gs.setAccountno(gs.getAccountno()+1);
	}
	gs.setName(name);
	gs.setBalance(balance);
	gs.setAmount(amount);
}



}
