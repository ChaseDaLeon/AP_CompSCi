package pkg;

public class CVMath {		
	public static void specialSquare(int a){
		int amount = 0;
		int i = 0;
		int counter = 0;
		int perfectSquare = 0;
		while(i<amount){
			perfectSquare = counter*counter;
			while(true){
				i = i+counter;
				counter++;
				if(i==perfectSquare){
					amount++;
					System.out.println(perfectSquare);
					break;
				}
				else{
					if(i>perfectSquare){
						break;
					}
				}
			}
			counter++;
			if(amount==a){
				break;
			}
		}
	}
	
}