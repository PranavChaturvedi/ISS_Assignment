public class Loops {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // range based for loop
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        // while loop
        int j = 0;
        while(j < arr.length){
            System.out.print(arr[j]+ " ");
            j++;
        }
        System.out.println();

        // do while loop
        j = 0;
        do{
            System.out.print(arr[j] + " ");
            j++;
        }while (j < arr.length);
        System.out.println();

        // break statement
        for(int x : arr){
            if(x==5)break;
            System.out.print(x + " ");
        }
        System.out.println();

        //continue
        for(int x : arr){
            if(x==5)continue;
            System.out.print(x + " ");
        }
        System.out.println();

        //return statement can be demonstrated using recursion
        System.out.println(factorial(5) + " ");
    }
    public static int factorial(int x){
        if(x==1){
            return x;
        }
        else{
            return x*factorial(x-1);
        }
    }
}
