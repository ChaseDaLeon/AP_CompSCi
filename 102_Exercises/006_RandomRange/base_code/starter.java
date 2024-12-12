/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("Give a number");
		int a = x.nextInt();
		Scanner y = new Scanner(System.in);
		System.out.println("Give another number larger than the first one");
		int b = y.nextInt();
		System.out.println("Your range is " + a +" to "+b);
		System.out.println("Here are 5 numbers generated in this range: ");
		System.out.println((int)((Math.random()*b)+a)+", "+(int)((Math.random()*b)+a)+", "+(int)((Math.random()*b)+a)+", "+(int)((Math.random()*b)+a)+", "+(int)((Math.random()*b)+a));
		
		
	}
}
