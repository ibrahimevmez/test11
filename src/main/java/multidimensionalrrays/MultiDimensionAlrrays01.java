package multidimensionalrrays;

import java.util.Arrays;

public class MultiDimensionAlrrays01 {
    public static void main(String[] args) {

       String [][]ar = new String[2][3];
       ar[0][0] = "a";
       ar[0][1] = "b";
       ar[0][2] = "c";
       ar[1][0] = "d";
       ar[1][1] = "e";
       ar[1][2] = "f";
       System.out.println(Arrays.deepToString(ar));
       int counter = 0;
       for(String[] w : ar){
           counter += w.length;
       }
        System.out.println(counter);
       int arr[][] = {{2,5,6},{6,3,2},{1,5}};

       int carpim =1;
       for(int[] w : arr){
           for(int k :w){
               carpim = carpim*k;
           }
       }
        System.out.println(carpim);













    }
}
