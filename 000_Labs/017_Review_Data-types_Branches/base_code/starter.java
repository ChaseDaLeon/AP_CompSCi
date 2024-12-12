/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("What should your character be named?");
	String name = scan.nextLine();
	System.out.println("What's your title?");
	String title = scan.nextLine();
	System.out.println("Do you want to be a Wizard, Warrior, or a Rouge?");
	String class1 = scan.nextLine();
	if(class1.equals("Wizard")){
		System.out.println("You're a Wizard!");
		System.out.println("You have 20 skill points to use. You may put a maximum of 10 points into one trait");
		System.out.println("Strength - How strong you are, + Attack strength");
		System.out.println("Dexterity - How in shape you are, + Attack speed and agility");
		System.out.println("Intelligence - How smart you are, + Magic power");
		System.out.println("Charisma - How well you get along with others, + Charisma");
		System.out.println("");
		System.out.println("How many points would you like to put into Strenghth?");
		System.out.println("Points left to use: 20");
		int strStat = scan.nextInt();
		if(strStat>10){
			System.out.println("Exceeds max points, (10 max)");
		}
		System.out.println("How many points would you like to put into Dexterity?");
		System.out.println("Points left to use: " + (20-strStat));
		int dexStat = scan.nextInt();
			if(dexStat>10){
			System.out.println("Exceeds max points, (10 max)");
			}
			System.out.println("How many points would you like to put into Intelligence?");
			System.out.println("Points left to use: " + (20-strStat-dexStat));
			int intStat = scan.nextInt();
				if(intStat>10){
				System.out.println("Exceeds max points, (10 max)");
				}
				System.out.println("How many points would you like to put into Charisma?");
				System.out.println("Points left to use: " + (20-strStat-dexStat-intStat));
				int charStat = scan.nextInt();
					if(charStat>10){
					System.out.println("Exceeds max points, (10 max)");
					}
						if((strStat+dexStat+intStat+charStat)>20){
						System.out.println("Points exceed max limit, (20 max total points)");
						}
							else{
							System.out.println("Leftover points: " + (20-(strStat+dexStat+intStat+charStat)));
							System.out.println("Your name is:" + name);
							System.out.println("Your title is:" + title);
							System.out.println("Your stats:");
							System.out.println("Strength: "+ strStat);
							System.out.println("Dexterity: "+ dexStat);
							System.out.println("Intelligence: "+ intStat);
							System.out.println("Charisma: "+ charStat);
							}
			}
	else if(class1.equals("Warrior")){
		System.out.println("You're a Warrior!");
		z
	}
	else if(class1.equals("Rouge")){
		System.out.println("You're a Rouge!");
	}
	else{
		System.out.println("Wrong input");
	}
}
}
