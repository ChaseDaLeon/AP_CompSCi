/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1001];
		for(int a = 0; a < 1001; a++){
			arr[a] = (int)(Math.random()*100);
		}
		for(int b = 0; b <1001; b++){
			System.out.println(arr[b]);
		}
	}
}
