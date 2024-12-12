/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int dough = 100;
		System.out.println("Wanna play the game?");
		String answer = scan.nextLine();
		if(answer.equals("Yes")||answer.equals("yes")||answer.equals("Y")||answer.equals("y")){
			while(dough>0){
			System.out.println("Your balance: $"+dough);
			System.out.println("How much do u wanna bet?");
			int bet = scan.nextInt();
			if(bet>dough){
				System.out.println("You don't have enough money for that");
				break;
			}
			dough = dough - bet;
			int a = (int)(Math.random()*10);
			int b = (int)(Math.random()*10);
			int c = (int)(Math.random()*10);
			System.out.println(a+"|"+b+"|"+c);
			if(a==b||a==c||b==a||b==c||c==a||c==b){
				dough = dough + (bet*2);
				System.out.println("You won! Your balance: $"+dough);
				String restart2 = scan.nextLine();
				System.out.println("play again?");
				String restart3 = scan.nextLine();
				if(restart3.equals("Yes")||restart3.equals("yes")||restart3.equals("Y")||restart3.equals("y")){
				}
				else if(restart3.equals("No")||restart3.equals("no")||restart3.equals("N")||restart3.equals("n")){
					System.out.println("Balance left: $"+dough);
					break;
				}
				else{
				System.out.println("Wrong input.");
			}
			}
			else if(a==b&&a==c){
				dough= dough + (bet*3);
				System.out.println("You won! Your balance: $"+dough);
				String restart4 = scan.nextLine();
				System.out.println("play again?");
				String restart5 = scan.nextLine();
				if(restart5.equals("Yes")||restart5.equals("yes")||restart5.equals("Y")||restart5.equals("y")){
				}
				else if(restart5.equals("No")||restart5.equals("no")||restart5.equals("N")||restart5.equals("n")){
					System.out.println("Balance left: $"+dough);
					break;
				}
				else{
				System.out.println("Wrong input.");
			}
				
			}
			else{
				if(dough<=0){
				System.out.println("You lost!");
				System.out.println("You ran out of money!");
					break;
				}
				String restart1 = scan.nextLine();
				System.out.println("U lost, try again?");
				String restart = scan.nextLine();
				if(restart.equals("Yes")||restart.equals("yes")||restart.equals("Y")||restart.equals("y")){
				}
				else if(restart.equals("No")||restart.equals("no")||restart.equals("N")||restart.equals("n")){
					System.out.println("Balance left: $"+dough);
					break;
				}
				else{
				System.out.println("Wrong input.");
			}
			}
		}
		}
		else if(answer.equals("No")||answer.equals("no")||answer.equals("N")||answer.equals("n")){
				System.out.println("u missed out.");
		}
		else{
			System.out.println("Wrong input.");
		}
		
			}
			
		}
	

