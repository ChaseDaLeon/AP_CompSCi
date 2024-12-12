/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lets play a guessing game! Pick a number between 1 and 100 and i'll tell you if you're right!");
		int x= (int)(Math.random()*100)+1;
		int y= scan.nextInt();
		if(x==y){
			System.out.println("You got it right!");
		}
		else{
			System.out.println("Sorry, but thats not right");
		}
	}
}
