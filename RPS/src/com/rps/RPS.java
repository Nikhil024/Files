package com.rps;
import java.util.Random;


public class RPS {


	public enum Signs { ROCK, PAPER, SISSORS }

	public static Signs randomLetter() {
		int pick = new Random().nextInt(Signs.values().length);
		//System.out.println(pick);
		return Signs.values()[pick];
	}


	public static String Choice(int ch) {
		String User_input = null;
		if(ch==1){
			User_input = "ROCK";
			return User_input;
		}
		else if(ch==2){
			User_input = "PAPER";
			return User_input;
		}
		else if(ch==3){
			User_input = "SISSORS";
			return User_input;
		}
		else{
			System.out.println("Please enter a valid choice from the list");
			System.exit(0);
			return User_input;
		}
		
	}
}
