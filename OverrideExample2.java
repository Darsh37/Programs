import java.util.*;

class Vehicle{
    void Vehicle(){
        System.out.println("This is constructor of vehicle class");
    }
}
class Bike extends Vehicle{
    void Vehicle(){
        System.out.println("I try to override Constructor");
        System.out.println("Bike is Ruuning");

    }
}
public class OverridingExample2 {
    public static void main(String args[]){
        Bike B1 = new Bike();
        B1.Ride();
    }
}