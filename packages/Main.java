package packages;

import calculator.*;

/* Running Package Files -
praveenbm@lp-praveen:~/courses/java$ javac packages/*.java calculator/*.java
praveenbm@lp-praveen:~/courses/java$ javac packages.Main
*/

public class Main {
    public static void main(String[] args){
        ScientificCalculator obj = new ScientificCalculator();
        System.out.println("Addition: "+obj.add(2,2));
        System.out.println("Subtraction: "+obj.subtract(2,2));
        System.out.println("Multiplication: "+obj.multiplication(2,2));
        System.out.println("Division: "+obj.division(2,2));
        System.out.println("Power: "+obj.power(2, 2));
    }
    
}
