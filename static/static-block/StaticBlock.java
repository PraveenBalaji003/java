class A{
    public A(){
        System.out.println("Constructor Called...");
    }
    // Static block is always called first, before the constructor.
    // Because the class is loaded only once by the class loader in the JVM.
    static{
        System.out.println("Static Block Called...");
    } 
}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException{
        //If we commented object creation, static block will also not be called. So, we can use below method
        Class.forName("A");
        // A obj1 = new A();
        // A obj2 = new A();
    }
}
