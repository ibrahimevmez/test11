package multidimensionalrrays;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalArrays00 {
    public static void main(String[] args) {

//        int [][]array = {{1,2,3},{4,5,6}};
//        int t =0;
//        for(int[] w : array) {
//            for(int k : w) {
//                t+=k;
//            }
//        }
//        System.out.println(t);

//        int [][]array = {{1,2,3},{4,5,6}};
//        int tt = 1;
//        for(int[] w : array) {
//            for(int k : w) {
//                tt*=k;
//            }
//        }
//        System.out.println(tt);
        int me[][] = {{1, 2, 3}, {4, 5}, {6}};
        int carpim = 1;
        for (int i = 0; i < me.length; i++) {
            for (int j = 0; j < me[i].length; j++) {
                if (j == me[i].length - 1) {
                    carpim = carpim * me[i][j];
                }
            }
        }
        System.out.println(carpim);
        System.out.println();


        int arr[] = new int[5];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= arr.length; i++) {
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Character> listt = new ArrayList<Character>();
        for (char i = 'a'; i <= 'e'; i++) {
            listt.clear();
            listt.add(i);
        }
        System.out.println(listt);
        List<Integer> listtt = new ArrayList<>();
        listtt.add(3);
        listtt.add(5);
        listtt.add(7);
        listtt.add(9);
        int i = 0;
        int x = 0;
        while (i < listtt.size()) {
            x = x + listtt.get(i);
            i++;
        }
        System.out.println(x);
    }
}


