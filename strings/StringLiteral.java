public class StringLiteral {
     public static void main(String[] args) {
        // 📌 Both go to String Constant Pool
        // Java checks pool first - "pravin" already exists, so reuses it
        String literal1 = "pravin";
        String literal2 = "pravin";

        System.out.println("======= LITERAL vs LITERAL =======");
        System.out.println("literal1 == literal2:      " + (literal1 == literal2)); // true ✅ same pool object
        System.out.println("literal1.equals(literal2): " + literal1.equals(literal2));// true ✅ same value
        System.out.println("literal1 address: " + System.identityHashCode(literal1));// same
        System.out.println("literal2 address: " + System.identityHashCode(literal2));// same
    }
}
