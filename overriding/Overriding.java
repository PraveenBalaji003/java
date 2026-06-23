// Polymorphism - Run Time Polymorphism (Dynamic Method Dispatch)

// Method Overriding Rules:
// 1. Method name must be exactly the same as in the superclass.
// 2. Parameter list (number, type, and order) must be identical
// 3. Return type must be the same or a covariant (subtype) of the superclass method's return type.
// 4. Access modifier cannot be more restrictive than the superclass method (e.g., public -> protected is NOT allowed).
class A {
    
    public void show() {
        System.out.println("Show A");
    }

    public void config() {
        System.out.println("Config A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Show B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); 
        obj.config();  
    }
}
