interface Calculate{
    int Number1;
    int Number2;
    void add();
    void Subtract();
    void Multiplication();
    void Divide();
}

abstract class Multiplication implements Calculate{
    public void Multiplication(){
        System.out.println("Multiplication is"+);
    }
}

class Arrithmetic extends Multiplication{
    public void add(){
        System.out.println("I am a");
    }
    public void Subtract(){
        System.out.println("I am b");
    }
    public void d(){
        System.out.println("I am d");
    }
}

class AbstractInterface{
    public static void main(String args[]){
        Calculate cal=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }}
