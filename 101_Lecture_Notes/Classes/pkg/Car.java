/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String model;
    double maxSpeed;
    boolean isElectric;
    String color;
    
    public Car(){
        model = "Bus";
        maxSpeed= 1.1;
        isElectric = false;
        color = "Blue & Red";
    }
    public Car(String m, double s, String c){
        model = m;
        maxSpeed = s;
        isElectric = false;
        color = c;
    }
    
    public void paint(String c){
        color = c;
    }
    
    public void showSpecs(){
        System.out.println(model);
        System.out.println(maxSpeed);
        System.out.println(isElectric);
        System.out.println(color);
    }
    public void vroom(){
        int count = 0;
        while(count < maxSpeed){
            System.out.println(model + " goes vrroooooooooom");
            count = count + 10;
        }
    }
}