class A{
    public A(){
        System.out.println("in A");
    }
    public A(int num){
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }
    public B(int num){
        this();
        System.out.println("in B int");
    }
}

public class Main {
    //this() — calls another constructor of the same class (constructor chaining).
    //Must be the first statement in the constructor.

    //super() — calls a constructor of the immediate parent class.
    //If you do not explicitly write super(), the compiler automatically inserts a no-argument super() as the first statement of every subclass constructor.
    public static void main(String[] args){
        B obj = new B(5);

    }    
}
