public class EnhancedForLoop{
    public static void main(String[] args){
        int array[][] = new int[3][3];
        for(int arr[]: array){
            for(int num: arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}