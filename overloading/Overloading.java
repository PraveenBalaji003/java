public class Overloading{
    // Method Overloading:
    // Same method name with different parameter lists (number, type, or order)
    // It is an example of compile-time polymorphism
    // Return type alone cannot be used to differentiate overloaded methods
    public void printNumbers(int num1, int num2){
        System.out.println("Number 1: "+num1+"\nNumber 2: "+num2);
    }
    public void printNumbers(int num1, int num2, int num3){
        System.out.println("Number 1: "+num1+"\nNumber 2: "+num2+"\nNumber 3: "+num3);
    }
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        Overloading obj = new Overloading();
        System.out.println("=================================");
        obj.printNumbers(num1, num2);
        System.out.println("=================================");
        obj.printNumbers(num1, num2, num3);
        System.out.println("=================================");
    }
}