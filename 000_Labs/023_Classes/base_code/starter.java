/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	String role;
	int Strength;
	int Dexterity;
	int Intelligence;
	int Charisma;
	
	public myCharacter(){
		role = "Wizard";
		Strength = 9;
		Dexterity = 7;
		Intelligence = 3;
		Charisma = 2;
	}
	
	public void showStats(){
		System.out.println(role);
		System.out.println(Strength);
		System.out.println(Dexterity);
		System.out.println(Intelligence);
		System.out.println(Charisma);
	}
}
