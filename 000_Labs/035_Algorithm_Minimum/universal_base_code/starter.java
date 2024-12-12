/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int arraySize = (int)(Math.random()*149)+50;
		int [] arr = new int[arraySize];

		for(int a = 0; a < arraySize; a++){
			arr[a] = (int)(Math.random()*100);
		}
		for(int b = 0; b <arraySize; b++){
			System.out.println(arr[b]);
		}
		int min = arr[0];
		for(int i = 0; i < arraySize; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			
		}
		
		int max = arr[0];
		for(int i = 0; i < arraySize; i++){
			if(arr[i] > max);
			max = arr[i];
		}
		int total = 0;
		for(int i = 0; i< arraySize; i++){
		total = total + arr[i];
		i++;
		}
		int average = total/arraySize;
		System.out.println("average:"+average);
		System.out.println("minimum:"+min);
		System.out.println("maximum:"+max);
		
	}
}
