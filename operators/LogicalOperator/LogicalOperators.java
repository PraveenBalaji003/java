public class LogicalOperators {
    public static void main(String[] args){
    // AND - && - Both conditions should be true
    //  OR - || - Any one of the condtion should be true
    // NOT - ! - Reverses the condition
    int a = 5;
    int b = 10;
    int c = 20;
    System.out.println("a < c && b < c = "+ (a<c && b<c));
    System.out.println("a > b || b < c = "+ (a>b || b<c));
    System.out.println("! a <= b && b <= c = "+ !(a<=b && b<=c));
    }
}
