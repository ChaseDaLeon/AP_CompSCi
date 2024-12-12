/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner numba = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int next = numba.nextInt();
    System.out.println("These are the next 5 numbers:" + (next+1) +", "+ (next+2) +", "+ (next+3)+", " + (next+4)+", " + (next+5));
    System.out.println("These are the next 5 multiples:" + (next*2) +", "+ (next*3) +", "+ (next*4)+", " + (next*5)+", " + (next*6));
    System.out.println("Your number divided by 100 is, " +(next/100));
    System.out.println("Your number divided by 10 is, " +(next/10));
	}
}
