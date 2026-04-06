public class Literals {
    public static void main(String[] args){
        int num1 = 9;           // Decimal (Base 10)  → normal number
        int num2 = 0b101;      // Binary  (Base 2)   → prints 5
        int num3 = 0x7E;      // Hexadecimal (Base 16) → prints 126

        // Hard to count zeros
        int num4 = 10000000;
        // Easy to read
        // output is still a normal number
        int num5 = 1_00_00_000;   // underscore just helps YOU read it

        double num6 = 56;      // int auto-converts to double (because default data type of integer value is int in java)
        double num7 = 12e10;  // means 12 × 10^10  (scientific notation)

        boolean num8 = true;    
        boolean num9 = false; 
        //boolean num10 = 1; // ERROR — Java doesn't accept 1/0 for boolean

        char c = 'a';    // single quotes for char
        c++;             // char behaves like integer internally
        System.out.println(c);  // prints 'b'  (a+1 = b in ASCII)

        String s = "Hello World";  // double quotes = String literal
                  
    }
    
}
