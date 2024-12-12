/*
 *	Author:
 *  Date:
 * 	Collaborator: 
  Create a program that takes in two input integers. 
- First check if each of these integers are odd or even. Output if each are or not.
- Then check if they're divisible by 3, 4, and 5. Make sure ALL of these are checked.
- Otherwise if it's not divisible by all 3, 4, or 5, output that it isn't! Only if all 3!
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Give me a number");
	int num1 = scan.nextInt();
	System.out.println("Give me another number");
	int num2 = scan.nextInt();
	if((num1%2)==0){
		System.out.println("number 1 is even");
	}
	else{
		System.out.println("number 1 is odd");
	}
	if((num2%2)==0){
		System.out.println("number 2 is even");
	}
	else{
		System.out.println("number 2 is odd");
	}
	if((num1%3)==0){
		System.out.println("number 1 is divisible by 3");
	}
	else if((num1%4)==0){
		System.out.println("number 1 is divisible by 4");
	}
	else if((num1%4)==0){
		System.out.println("number 1 is divisible by 4");
	}
	else{
		System.out.println("number 1 is not divisible by 3,4, or 5");
	}
	if((num2%3)==0){
		System.out.println("number 2 is divisible by 3");
	}
	else if((num2%4)==0){
		System.out.println("number 2 is divisible by 4");
	}
	else if((num2%4)==0){
		System.out.println("number 2 is divisible by 4");
	}
	else{
		System.out.println("number 2 is not divisible by 3,4, or 5");
	}
}
}
