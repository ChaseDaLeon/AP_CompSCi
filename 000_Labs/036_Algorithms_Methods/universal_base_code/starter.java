/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int [] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static int getArrayAverage(int [] arr){
		int total = 0;
		int average = 0;
		for(int i = 0; i < arr.length; i++){
			total = total + arr[i];
		}
		average = total/arr.length;
		return average;
	}
	
	public static int getArrayMax(int [] arr){
		int max = 0;
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i]<arr[i+1]){
			max = arr[i+1];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] arr){
		int min = 0;
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i]<arr[i+1]){
			min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		int [] arr = new int[3];
		arr[0]=1;
		arr[1]=7;
		arr[2]=10;
		toStringArray(arr);
		int a = getArrayMin(arr);
		System.out.println(a);

 

		
	}
}
