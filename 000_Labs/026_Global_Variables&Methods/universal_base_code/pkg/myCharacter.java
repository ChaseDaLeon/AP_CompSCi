/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
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
	
	public void myToString(){
		System.out.println(role);
		System.out.println(strength);
		System.out.println(dexterity);
		System.out.println(intelligence);
		System.out.println(charisma);
	}
}
