/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int a = (int)(Math.random()*10);
	System.out.println("Guess a number between 1-10!");
	while(true){
	
		int guess = scan.nextInt();
		if(guess==a){
		break;
		}
		System.out.println("Wrong, try again");
		
	}
	System.out.println("You guessed it!");

		
	}
}
