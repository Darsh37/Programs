
class Math{
    void Calcualte(int number1, int number2 ){
        System.out.println("This calculate method add two numbers in addition class ");
    }
}
class Addition extends Math{
    void Calcualte(int number1, int number2 ){
        int result;
        result = number1+ number2;
        System.out.println("Result"+ result);

    }
}
public class OverrideExample3 {
    public static void main(String args[]) {
        Math m = new Addition();
        m.Calcualte(10,20);

//         Math m = new Math();
//         m.Calcualte(10,20);
//        Addition add = new Addition();
//        add.Calcualte(10, 20);
    }
}