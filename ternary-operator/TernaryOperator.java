public class TernaryOperator {
    public static void main(String[] args){
        // Ternary Operator Syntax: (condition) ? valueIfTrue : valueIfFalse
        // If num is divisible by 2 (even) → print "Even Number"
        // Else (odd)                       → print "Odd Number"
        int num = 10;
        System.out.println((num % 2 == 0 ? "Even Number: " : "Odd Number: ")+num);
    }
    
}
