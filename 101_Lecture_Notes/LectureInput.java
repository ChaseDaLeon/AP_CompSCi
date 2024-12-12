/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        
        System.out.println("Please enter a number");
        int hi = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter another number");
        int bye = sc.nextInt();
        sc.nextLine();
        System.out.println("the sum is " + (hi+bye));
        
        System.out.println("What's your favorite food?");
        String food = sc.nextLine();
 
	}
}