import pkg.*;

class starter {
	public static void specialSquare(int a){
	}
	public static void main(String args[]) {
		int amount = 0;
		int i = 0;
		int counter = 1;
		int perfectSquare = 0;
		while(i<3){
			perfectSquare = counter*counter;
			while(true){
				i = i+counter;
				System.out.println(i);
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
			if(amount==3){
				break;
			}
		}
	}
	}

