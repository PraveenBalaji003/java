public class Main{
    public static void main(String[] args){
        int a=10;
        int b=20;
        /*
         * A Class is a blueprint/template that defines:
         *   - State     : represented by fields/variables (e.g., result, memory)
         *   - Behaviour : represented by methods (e.g., add, subtract)
         *
         * A Class does not occupy memory by itself — only its object does.
        */
        /*
         * Creating an object (instance) of the Calculator class using the 'new' keyword.
        */
        Calculator cal = new Calculator();
        System.out.println(cal.add(a, b));
    }
}