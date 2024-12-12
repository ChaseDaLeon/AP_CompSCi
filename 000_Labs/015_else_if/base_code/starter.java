/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lets play a guessing game! Pick a number between 1 and 1000 and i'll tell you if you're right!");
		int x= (int)(Math.random()*1000)+1;
		int y= scan.nextInt();
		if(x>y){
			System.out.println("Wrong, try Higher!");
		}
		else if(x<y){
			System.out.println("Wrong, try Lower!");
		}
		else{
			System.out.println("Yup! u got it!");
		}
	}
}
