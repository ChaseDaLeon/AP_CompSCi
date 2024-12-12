package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog(){
	name = "Clifford";
	age = 3;
	breed = "big red dog";
	}
	
	public Dog(String a){
	age = 1;
	breed = "dog dog";
	name = a;
	}
	
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	
	public Dog(String a, int b){
		name = a;
		age = b;
		breed = "dog dog";
		}
		
	public void setName(String a){
		name = a;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setBreed(String a){
		breed = a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public static boolean isSleeping(){
		int a = (int)(Math.random()*2)+1;
		if(a==1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void bark(){
		System.out.println(name + " barks!!");
	}
}