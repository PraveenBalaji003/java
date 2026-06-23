class A{
    public void show1(){
        System.out.println("Show A...");
    }
    public void print(){
        System.out.println("Print A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("Show B...");
    }
    public void print(){
        System.out.println("Print B");
    }
}

public class Main{
    public static void main(String[] args){
        // A obj1 - is the reference
        // new B() - is the object
        A obj1 = new B(); //Up-Casting
        // In this, using obj1 you can able to access the methods in classA, if the same method was present
        //in class B. Class B method will override otherwise you can't access any other method in class B.
        obj1.show1();
        B obj2 = (B) obj1;//Down-Casting
        obj2.show2();
    }
}