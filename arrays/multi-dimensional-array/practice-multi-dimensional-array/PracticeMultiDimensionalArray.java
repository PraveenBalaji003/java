public class PracticeMultiDimensionalArray {
    public static void main(String[] args) {
     String array[][] = new String[3][3];
     for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length;j++){
            array[i][j] = i==j?"1":"0";
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
     }   
    }    
}
