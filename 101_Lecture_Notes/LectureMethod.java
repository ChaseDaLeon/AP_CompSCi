/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("Chase");
        double num = raise(98000, 5);
        System.out.println(num);
        num = raise(num, 15);
        System.out.println(num);
	}
	public static void printAnimal(){
	    System.out.println(" ^ ^");
	    System.out.println("(O,O)");
	    System.out.println("(   )");
	    System.out.println("-\"-\"---");
	}
	public static void greeting(String name){
	    System.out.println("Hello, " + name);
	}
	public static double raise(double salary, int percent){
	    double amount = salary  + (salary * (percent/100.0));
	    return amount;
	}
}