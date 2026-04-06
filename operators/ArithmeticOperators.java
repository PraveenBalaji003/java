public class ArithmeticOperators{
    public static void main(String[] args){
        //addition, subraction, multiplication, division and modulo
        int i = 4;
        int j = 2;
        System.out.println("i + j = "+(i+j));
        System.out.println("i - j = "+(i-j));
        System.out.println("i * j = "+(i*j));
        System.out.println("i / j = "+(i/j));
        System.out.println("i % j = "+(i%j));
        
        // Post-Increment
        // How Post-Increment Works
        // int result = a++;
        // This single line executes in two steps:
        // Step 1: result = a      → result gets the CURRENT value (10)
        // Step 2: a = a + 1       → a becomes 11  (AFTER assignment)
        int a = 10;
        int result = a++;
        System.out.println("a = "+a);
        System.out.println("result = "+result);

        //Pre-Increment
        // How it executes step by step
        // int result = ++a;
        // Step 1: a = a + 1       → a becomes 11  (increments FIRST)
        // Step 2: result = a      → result gets the NEW value (11)
        int b = 20;
        result = ++b;
        System.out.println("b = "+b);
        System.out.println("result = "+result);

        //short-hand operator
        int c = 0;
        c += 1;
        System.out.println("c = "+c);
    }
}