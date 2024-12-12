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
	
	public String setRole(String a){
	role = a;
	return role;
	}
	
	public int setStrength(int a){
	strength = a;
	return strength;	
	}
	public int setDexterity(int a){
	dexterity = a;
	return dexterity;	
	}
	public int setIntelligence(int a){
	intelligence = a;
	return intelligence;	
	}
	public int setCharisma(int a){
	charisma = a;
	return charisma;
	}
}
