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
		System.out.println("Give another");
		int z = scan.nextInt();
		if(x>y&&x>z){
			System.out.println(x+" is the biggest");
		}
		else if(y>z&&y>x){
			System.out.println(y+" is the biggest");
		}
		else if(z>y&&z>x){
			System.out.println(z+" is the biggest");
		}
		if(x<y&&x<z){
			System.out.println(x+" is the smallest");
		}
		else if(y<x&&y<z){
			System.out.println(y+" is the smallest");
		}
		else if(y<z&&y<x){
			System.out.println(x+" is the smallest");
		}
		else{
			System.out.println("Theyre all the same");
		}
	}
}
