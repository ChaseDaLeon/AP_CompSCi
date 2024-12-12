/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Give me a number");
		int x = scan.nextInt();
		System.out.println("Give another");
		int y = scan.nextInt();
		if(x==y){
		System.out.print("U gave me the same number!!!");
		}
	}
}
