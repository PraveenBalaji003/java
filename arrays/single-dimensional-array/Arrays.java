

public class Arrays{
    public static void main(String[] args){
        // Array: used to store multiple values of the same data type
        /*
         * Arrays have a fixed size.
         * Once an array is created (initialized), its size cannot be changed.
        */
        int arr1[] = {1,2,3,4,5};
        System.out.println("First element of the array arr1 is - "+arr1[0]);
        // Accessing the first element (index starts from 0)
        arr1[0] = 0;
        System.out.println("After Update, First element of the array arr1 is - "+arr1[0]);
        System.out.println("=============================================");
        //Whatever that we initialized below is size, we can store 100 elements
        //But the index will start from '0' and ended in '100'
        int arr2[] = new int[100];
        for(int i=0;i<100;i++){
            arr2[i] = i+1;
            System.out.println(arr2[i]);
        }
        System.out.println("=============================================");
    }
}