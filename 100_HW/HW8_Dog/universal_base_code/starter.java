/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	boolean barks = false;
	Dog bruno = new Dog("Bruno");
	bruno.setAge(5);
	if(bruno.isSleeping()){
		System.out.println("shhh he's asleep");
	}
	else{
		bruno.bark();
		barks = true;
	}
	Dog milo = new Dog("Milo", "Poodle");
	if(barks==true){
		milo.bark();
	}
	}
}
