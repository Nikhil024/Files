package com.rps;

import java.util.Scanner;

public class RPSMain {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String User_input;
		boolean chs = true;
		String Comp_input;
		while(chs){
		System.out.println("Enter the Sign\n1.ROCK\n2.PAPER\n3.SISSORS");
		int ch = sc.nextInt();
		sc.nextLine();
		User_input = RPS.Choice(ch);
		Comp_input = RPS.randomLetter().toString();


		if(Comp_input.equals(User_input)){
			System.out.println("Its a Tie!!");
		}
		else{

			if(Comp_input.equals("ROCK") && User_input.equals("PAPER")){
				System.out.println("User Wins..!!");
				System.out.println("Computers sign "+Comp_input);
				System.out.println("Do you want to continue press y for Yes and n for No");
				if(sc.nextLine().equals("y")){
					chs = true;
				}
				else{
					chs = false;
				}
			}
			else if(Comp_input.equals("PAPER") && User_input.equals("ROCK")){
				System.out.println("Computer Wins..!!");
				System.out.println("Computers sign "+Comp_input);
				System.out.println("Do you want to continue press y for Yes and n for No");
				if(sc.nextLine().equals("y")){
					chs = true;
				}
				else{
					chs = false;
				}
			}
			else if(Comp_input.equals("PAPER") && User_input.equals("SISSORS")){
				System.out.println("User wins..!");
				System.out.println("Computers sign "+Comp_input);
				System.out.println("Do you want to continue press y for Yes and n for No");
				if(sc.nextLine().equals("y")){
					chs = true;
				}
			}
			else if(Comp_input.equals("SISSORS") && User_input.equals("PAPER")){
				System.out.println("Computer wins..!");
				System.out.println("Computers sign "+Comp_input);
				System.out.println("Do you want to continue press y for Yes and n for No");
				if(sc.nextLine().equals("y")){
					chs = true;
				}
				else{
					chs = false;
				}
			}
			else if(Comp_input.equals("ROCK") && User_input.equals("SISSORS")){
				System.out.println("Computer wins..!");
				System.out.println("Computers sign "+Comp_input);
				System.out.println("Do you want to continue press y for Yes and n for No");
				if(sc.nextLine().equals("y")){
					chs = true;
				}
				else{
					chs = false;
				}
				
			}
			else if(Comp_input.equals("SISSORS") && User_input.equals("ROCK")){
				System.out.println("User wins..!");
				System.out.println("Computers sign "+Comp_input);
				System.out.println("Do you want to continue press y for Yes and n for No");
				if(sc.nextLine().equals("y")){
					chs = true;
				}
				else{
					chs = false;
				}
			}

		}




	}


	}


}
