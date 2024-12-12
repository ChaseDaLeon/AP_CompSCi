/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	int randNum = (int)(Math.random()*11);
	int duplicates = 0;
	
	int arr[] = new int[20];
	for(int i = 0; i < 20; i++){
		arr[i]=(int)(Math.random()*11);
		System.out.println(arr[i]);
	}

	for(int i = 0; i < 20; i++){
		if(arr[i]==randNum){
			System.out.println("index " + i +" is a duplicate of the random number, " + randNum);
			duplicates++;
		}
	}
	System.out.println("there are "+duplicates+" duplicates in the array");
	
	
	for(int i = 0; i < 19; i++){
		if(arr[i]==arr[i+1]-1){
			System.out.println("index " + i + " and index " +(i+1)+ " are consecutive. The numbers are " + arr[i] + " and "+ arr[i+1]);
		}
	}
	}
}
