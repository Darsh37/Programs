//interface Vehicle{
//    public void Drive();
//}
//class Bike implements Vehicle{
//    public void Drive(){
//    System.out.println("Bike is running");
//    }
//}
//public class FunctionalInterfaceUsingLambda {
//    public static void main(String args[]){
////        Vehicle V1 =new Bike();
////        V1.Drive();
//        }
//}

interface Vehicle{
    public void Drive();
}
public class FunctionalInterfaceUsingLambda {
   public static void main(String args[]){
       Vehicle V1 =()-> System.out.println("Bike is running");
       V1.Drive();
       V1.Drive();
       V1.Drive();
        }
}