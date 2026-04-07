public class NestedWhileLoop {
    public static void main(String[] args) {
     int x = 1;
     System.out.println("............");
     while (x<=5) {
        int j = 1;
        while(j<=3){
        System.out.println(x+".Hi!");
        j++;
        }
        System.out.println("............");
        x++;
     }
    }
}
