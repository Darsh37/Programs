//interface Sum {
//    public void Calculate(int a, int b);
//}
//class Sum1 implements Sum{
//    public void Calculate(int a, int b){
////        System.out.println("Sum"+(a+b));
////        return a+b;
//
//    }
//}
//public class FIUsinLambda {
//    public static void main(String args[]){
//         Sum s1 = new Sum1();
//         s1.Calculate(10,20);
//    }
//}
interface Sum{
    public void Calculate(int a, int b);
}
public class FIUsinLambda {
   public static void main(String args[]){
         Sum s1 = (int a, int b)->{ System.out.println("The sum is"+(a+b));
             System.out.println("The substraction is"+(a-b));
             System.out.println("The Multipication is"+(a*b));
         };
         s1.Calculate(10,20);
        s1.Calculate(30,90);
   }
}