package accessspecifiers;

import entity.*;

public class Main extends Person {
    public static void main(String[] args){
        Person obj1 = new Person();
        // default - accessible only for the same package
        // obj1.name;  
        // public - accessible for same package and other packages also
        obj1.age = 18;
        // protected - accessible within same-package. If comes to other package only accessible for sub class.
        Main obj2 = new Main(); 
        obj2.gender = "male";
        // private - only accessible within the same class
        // obj1.income = 100000.00;

        /* What are the specifiers needs to be used?
           1) For instance variables mostly use the private as access specifier.
           2) Mostly try to avoid default specifier, better we can use public specifier for methods and classes. 
           3) We can't able to declare more than 1 public class in a same class.
       */
    }
    
}
