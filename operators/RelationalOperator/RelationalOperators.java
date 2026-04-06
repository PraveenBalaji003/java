public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        // < - Less Than
        System.out.println("=== Less Than (<) ===");
        System.out.println(a < b);   // true  - 10 < 20
        System.out.println(b < a);   // false - 20 < 10
        System.out.println(a < c);   // false - equal, not less

        // > - Greater Than
        System.out.println("\n=== Greater Than (>) ===");
        System.out.println(b > a);   // true  - 20 > 10
        System.out.println(a > b);   // false - 10 > 20
        System.out.println(a > c);   // false - equal, not greater

        // <= - Less Than or Equal To
        System.out.println("\n=== Less Than or Equal To (<=) ===");
        System.out.println(a <= b);  // true  - 10 <= 20
        System.out.println(a <= c);  // true  - 10 <= 10 (equal)
        System.out.println(b <= a);  // false - 20 <= 10

        // >= - Greater Than or Equal To
        System.out.println("\n=== Greater Than or Equal To (>=) ===");
        System.out.println(b >= a);  // true  - 20 >= 10
        System.out.println(a >= c);  // true  - 10 >= 10 (equal)
        System.out.println(a >= b);  // false - 10 >= 20

        // == - Equal To
        System.out.println("\n=== Equal To (==) ===");
        System.out.println(a == c);  // true  - 10 == 10
        System.out.println(a == b);  // false - 10 == 20

        // != - Not Equal To
        System.out.println("\n=== Not Equal To (!=) ===");
        System.out.println(a != b);  // true  - 10 != 20
        System.out.println(a != c);  // false - 10 != 10
    
}
}
