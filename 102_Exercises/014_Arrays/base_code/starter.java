/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1000];
		 int i = 0;
		 int value = 3;
		 while (i<1000){
		 	value = value + 3;
		 	arr[i]=value;
		 	i++;
		 	
		 }
		 i = 0;
		 while(i<1000){
		 	System.out.println(arr[i]);
		 	i++;
		 }
		 
		 i = 0;
		 value = 1000;
		 while (i<1000){
		 	arr[i]=value;
		 	i++;
		 	value = value -1;
		 }
		 i = 0;
		 while(i<1000){
		 	System.out.println(arr[i]);
		 	i++;
		 }
		 

	}
}
