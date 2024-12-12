/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String reversed = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a sentence");
		String sentence = sc.nextLine();
		while(true){
			if(sentence.indexOf(" ") == -1){
				
				break;
			}
		
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0,space);
		reversed = word + " "+ reversed ;
		
		sentence = sentence.substring(space+1);
		}
		reversed = sentence +" "+ reversed;
		System.out.print(reversed);
	}
}


