public class ReverseNumber {
    public static void main(String[] args) {
        // for loop structure:
        // int i = 100   → Initialization (runs only once at the beginning)
        // i >= 1        → Condition (checked before every iteration)
        // i--           → Update (runs after each iteration)

        // When incrementing (i++), use <= if you want to include the end value
        // When decrementing (i--), use >= if you want to include the end value
        for(int i =100; i>=1; i--){
            System.out.println(i);
        }   
    }
}
