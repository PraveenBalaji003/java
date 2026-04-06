public class TypeConversion {
    public static void main(String[] args) {
        //Implicit Casting 
         byte a = 127;
         short b = a;
         System.out.println("Implicit Casting\nb = "+b);  
         //Explicit Casting
         //byte c = b;We cant able to store the large data type value in small data type variable
         //So, we should explicitly cast
         byte c = (byte) b;
         System.out.println("Explicit Casting\nc = "+c);
    }
}
