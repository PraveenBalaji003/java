class A{
    public void show(){
        System.out.println("in show A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in show B");
    }
}

class C extends A{
    public void show(){
        System.out.println("in show C");
    }
}

public class Main {
    public static void main(String[] args){
        //Dynamic Method Dispatching - This can done only for the inheritance classes.
        //A obj - reference doesn't the matter, whatever the object - new B() is the matter and that method will override.
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
    
}
