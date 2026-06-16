package constructor;

public class Constructor {
    public static void main(String[] args){
        Calculator calc = new Calculator(1, 1);
        System.out.println("Result of addition of two numbers: "+calc.addTwoNumbers());
    }
    
}
