package inheritance.singlelevel;
public class Main {
    //Single Inheritance - One parent class, one subclass. That's it.
    public static void main(String[] args){
        AdvancedCalculator obj = new AdvancedCalculator();
        System.out.println("Addition: "+obj.add(2,2));
        System.out.println("Subtraction: "+obj.subtract(2,2));
        System.out.println("Multiplication: "+obj.multiplication(2,2));
        System.out.println("Division: "+obj.division(2,2));
    }
    
}
