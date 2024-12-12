./* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    Scanner one = New Scanner(System.in);
    System.out.println("Youre a student getting ready for school, choose your adventure!");
    System.out.println("You wake up to your alarm. what do you do?");
    System.out.println("1. You're still sleepy. Press snooze.");
    System.out.println("2. Get up and brush your teeth.");
    System.out.println("3. Get up and make some breakfast.");
    int answer1 = one.nextInt();
    
    if(answer1 == 1){
        System.out.println("Uh oh, you slept too long and you're running out of time to get ready! What will you do?");
        System.out.println("1. Get in the shower");
        System.out.println("2. Brush your teeth");
        System.out.println("3. Make breakfast");
        int answer2 = one.nextInt();
        if(answer == 1){
        System.out.println("");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        
    }
    if(answer1 == 2){
        System.out.println("You brush your teeth. What do u do next?");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }
    if(answer1 == 3){
        System.out.println("You're making breakfast. What do  you make?");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }
    
	}
}