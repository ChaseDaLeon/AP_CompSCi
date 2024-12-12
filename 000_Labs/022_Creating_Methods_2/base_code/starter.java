/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	double power = pow(5,3);
	System.out.println(power);
	}
	public static double pow(int a, int b){
		double num =a;
		while(b>1){
		num = num*a;
		b--;
		}

		return num;
		}
}
