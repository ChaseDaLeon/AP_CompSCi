/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.nextLine();
		for(int i = 0; i<word.length(); i++){
			System.out.println(word.substring(i,i+1));
		}
		
	}
}
