/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner whatDay = new Scanner(System.in);
	System.out.println("What day is it tomorrow?");
	System.out.println("0=Sunday, 1=Mon, 2=Tues, 3=Wed, 4=Thurs, 5=Fri, 6=Sat");
	int day = whatDay.nextInt();
	if(day==0||day==6){
		System.out.println("Alarm set for 10:00 AM");
	}
	else{
		System.out.println("Alarm set for 7:00 AM");
	}
	}
}
