/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	
	public myCharacter(){
		role = "No role";
	}
	
	public myCharacter(String a){
		role = a;
		System.out.println("You chose "+ a);
		
	}
	
	
	public void showStats(){
		System.out.println(role);
	}
}
