/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Do you want to be a Wizard, Warrior, or a Rouge?");
	String x = scan.nextLine();
	if(x.equals("Wizard")){
		System.out.println("You're a Wizard!");
	}
	else if(x.equals("Warrior")){
		System.out.println("You're a Warrior!");
	}
	else if(x.equals("Rouge")){
		System.out.println("You're a Rouge!");
	}
	else{
		System.out.println("Wrong input");
	}
	}
}
