/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word/phrase:");
		String sentence = sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				
				break;
			}
		
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0,space);
		System.out.print(spongeCase(word)+ " ");
		
		sentence = sentence.substring(space+1);
		}
		System.out.print(spongeCase(sentence));
	}
	public static String spongeCase(String x){
			for(int i = 0; i < x.length(); i++){
		if(i%2==0){
			x=x.toUpperCase();
		System.out.print(x.substring(i,i+1));
		}
		else{
		x=x.toLowerCase();
		System.out.print(x.substring(i,i+1));
		}
			}
		return (x.substring(x.length()));
	
	}
	
}
