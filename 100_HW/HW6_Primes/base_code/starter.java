/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Give a number");
		int primes = scan.nextInt();
		printPrimes(primes);
	}
public static boolean checkPrime(int a){
	int counter = 2;
	boolean prime = true;
	while(counter<a-1){

		if(a%counter==0){
			prime = false;
			break;
		}
		else{
			prime = true;
		}
		counter++;
}
	return prime;
}
public static void printPrimes(int num){
	int counter = 2;
	boolean prime = false;
	while(counter<num){
		prime = checkPrime(counter);
		if(prime==true){
			System.out.println(counter);
		}
		counter++;
		
	}
}
}