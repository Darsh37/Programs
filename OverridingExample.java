import java.util.*;

class Vehicle{
    void Ride(){
        System.out.println("This is constructor of vehicle class");
    }
}
class Bike extends Vehicle{
    void Ride(){
        System.out.println("Bike is running");
    }
}
public class OverridingExample {
      public static void main(String args[]){
          Bike B1 = new Bike();
          B1.Ride();
      }
}
