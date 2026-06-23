//final keyword - can be used with the - variable, method and class

final class Calculator{
    public int addition(int a, int b){
        return a+b;
    }
}

//class - we can use final keyword with the class to stop inheritance extending the properties with other class
//class AdvancedCalculator extends Calculator{
class AdvancedCalculator{
    public final int subraction(int a, int b){
        return a-b;
    }
}

class ScientificCalculator extends AdvancedCalculator {
    //method - we can use final keyword with the method to stop overriding those method in subclass
    // public final int subraction(int a, int b){
    //     return a-b;
    // }
    
}

public class Main {
    public static void main(String[] args){
        final int year = 2052;
            //variable - we can use final keyword with variable, will stops re-initializing the value for that final variable
        //year = 2053;
    }
}
