class Static{
    int a;
    int b;
    // We can't able to access the instance variables inside the static methods without the object
    // Because instance variables are associated with the objects 
    public static int addTwoNumbers(Static obj){
        obj.a = 1;
        obj.b = 2;
        return obj.a+obj.b;
    } 
}

public class Main {
    public static void main(String[] args){
        Static obj = new Static();
        // Static Methods can be called by using its class name.
        System.out.println("Addition of two numbers: "+Static.addTwoNumbers(obj));
    }
}
