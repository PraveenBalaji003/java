package inheritance.multilevel;
public class Main {
    //Multilevel Inheritance: subclass becomes a parent to yet another subclass.
    //Multiple Inheritance:Java does not support multiple inheritance for classes 
    public static void main(String[] args){
        ScientificCalculator obj = new ScientificCalculator();
        System.out.println("Addition: "+obj.add(2,2));
        System.out.println("Subtraction: "+obj.subtract(2,2));
        System.out.println("Multiplication: "+obj.multiplication(2,2));
        System.out.println("Division: "+obj.division(2,2));
        System.out.println("Power: "+obj.power(2, 2));
    }
    
}
