import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {20,10,40,30,50};
        int[] brr = {20,10,40,30};

        //convert elements into list
        System.out.println("Integer as a list "+ Arrays.asList(arr));

        //binary search

        System.out.println("40 at index " + Arrays.binarySearch(arr,40));

        //compare
        //Compares two arrays passed as parameters lexicographically.
        System.out.println("Compare " + Arrays.compare(arr,brr));
        System.out.println("Compare Unsigned " + Arrays.compareUnsigned(arr,brr));

        //copy certain elements from an array
        int[] crr = Arrays.copyOfRange(arr,1,3);
        System.out.println("Copied Array : " + Arrays.toString(crr));

        //fill an empty array
        int[] drr = new int[5];
        Arrays.fill(drr,100);
        System.out.println("Filled Array : " + Arrays.toString(drr));

        //convert array to hashcode
        System.out.println(Arrays.hashCode(arr));

        //sort arrays
        Arrays.sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));

        //check Student.java to see how sort works along with comparator interface

        //2D arrays
        // Generally 2D arrays have the same number of rows and columns
        int[][] a = new int[5][5];
        printTwoDimensionalArray(a);
        System.out.println();

        //Jagged Arrays are 2D Arrays where each row has variable number of columns
        int[][] c = new int[5][];
        for(int i=0;i<c.length;i++){
            c[i] = new int[i+1];
        }
        for(int i=1;i<=5;i++){
            int[] b = new int[c[i-1].length];
            for(int j=1;j<=i;j++){
                b[j-1] = j;
            }
            c[i-1] = b;
        }
        printTwoDimensionalArray(c);

        //Final Arrays
        /* final array means that the array variable which is actually a reference to an object,
        cannot be changed to refer to anything else, but the members of the array can be modified
         */

        final int[] farr = {1,2,3,4,5};
        for(int i=0;i< farr.length;i++){
            farr[i]*=10;
        }
        System.out.println(Arrays.toString(farr));

        //farr = new int[5];
        //the above line won't work as the array object cannot start referencing a new object

    }
    public static void printTwoDimensionalArray(int[][] arr){
        for (int[] x : arr){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
