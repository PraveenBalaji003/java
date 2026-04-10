public class ForLoop {
    public static void main(String[] args) {
     //When the iteration count is known in advance, a for loop is more suitable.
     for(int i=1; i<=4;i++){
        System.out.println("Week "+i);
        for(int j=1;j<=7;j++){
            System.out.println(j+".");
        }
     }   
    }
    
}
