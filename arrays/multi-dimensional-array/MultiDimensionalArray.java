import java.util.Arrays;

public class MultiDimensionalArray{
    public static void main(String[] arrays){
        int arr[][] = new int[3][3];
        int order=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                order+=1;
                arr[i][j]=order;
            }
        }
        System.out.println("Array1\n");
        System.out.println(Arrays.deepToString(arr));

        System.out.println("==================================");

        int arr2[][] = {{1,2,3}, {4,5,6}, {8,9,10}};
         System.out.println("Array2\n");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(arr2[i][j]);
                if(j==arr2.length-1)
                    System.out.println();
                else
                    System.out.print(", ");    
            }
        }
    }
}