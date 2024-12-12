/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Whats ur name?");
	String name = scan.nextLine();
	System.out.println("How many times do u want it printed?");
	int num = scan.nextInt();
	int count=0;
	while(true){

	if(count==num){
		break;
	}
	count=count+1;
	}
}
}
