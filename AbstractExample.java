import java.util.*;

abstract class Area{
   abstract void area1();
}
class Circle extends Area{
     void area1(){
         float length=8;
         float breadth=9;
        float area= 3.14f*length*breadth;
        System.out.println("Area of Circle"+area);
    }
}
public class AbstractExample {
    public  static void main(String args[]){
        Area c1= new Circle();
        c1.area1();

    }
}
