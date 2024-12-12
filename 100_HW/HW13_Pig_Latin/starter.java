/*
   * Author:
   * Date:
   * Collaborator(s):
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
		System.out.print(pigLatin(word)+ " ");
		
		sentence = sentence.substring(space+1);
		}
		System.out.print(pigLatin(sentence));
	}
	
	public static String pigLatin(String x){
		if(!x.substring(0,1).equals("a")&&!x.substring(0,1).equals("e")&&!x.substring(0,1).equals("i")&&!x.substring(0,1).equals("o")&&!x.substring(0,1).equals("u")&&!x.substring(0,1).equals("A")&&!x.substring(0,1).equals("E")&&!x.substring(0,1).equals("I")&&!x.substring(0,1).equals("O")&&!x.substring(0,1).equals("U")){
			if(x.substring(1,2).equals("a")||x.substring(1,2).equals("e")||x.substring(1,2).equals("i")||x.substring(1,2).equals("o")||x.substring(1,2).equals("u")||x.substring(1,2).equals("A")||x.substring(1,2).equals("E")||x.substring(1,2).equals("I")||x.substring(1,2).equals("O")||x.substring(1,2).equals("U")){
				x=x+"-"+x.substring(0,1)+"ay";
				x=x.substring(1);
				return x;
			}
			else if(!x.substring(1,2).equals("a")&&!x.substring(1,2).equals("e")&&!x.substring(1,2).equals("i")&&!x.substring(1,2).equals("o")&&!x.substring(1,2).equals("u")&&!x.substring(1,2).equals("A")&&!x.substring(1,2).equals("E")&&!x.substring(1,2).equals("I")&&!x.substring(1,2).equals("O")&&!x.substring(1,2).equals("U")){
			x=x+"-"+x.substring(0,1)+x.substring(1,2)+"ay";
			x=x.substring(2);
			return x;
			}
		}
		if(x.substring(0,1).equals("a")||x.substring(0,1).equals("e")||x.substring(0,1).equals("i")||x.substring(0,1).equals("o")||x.substring(0,1).equals("u")||x.substring(0,1).equals("A")||x.substring(0,1).equals("E")||x.substring(0,1).equals("I")||x.substring(0,1).equals("O")||x.substring(0,1).equals("U")){
			x=x+"-way";
			
		}
		return x;
	}
}
