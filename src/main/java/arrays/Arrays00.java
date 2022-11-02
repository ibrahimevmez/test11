package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays00 {
    public static void main(String[] args) {
//        int[] arr = {111, 22, 30, 45, 555, 6, 71, 8000, 92, 10};
//        String[] array = {"a", "b", "c", "d", "e", "f"};
//        Arrays.sort(arr);
//        int sayi = 22;
//        String str = "q";
//        System.out.println(Arrays.binarySearch(array,str));
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arr));

//        int ary[] = {-11, 2 -22, 30, -45, 555, 6, -9, 25};
//        Arrays.sort(ary);
//        System.out.println(Arrays.toString(ary));
//        int minNegative = ary[0];
//        int maxPositive = ary[ary.length - 1];
//
//        for (int w : ary) {
//            if(w>0){
//                maxPositive = Math.max(maxPositive, w);
//            }else if(w<0){
//                minNegative = Math.min(minNegative, w);
//            }
//        }
//        System.out.println("En kucuk  negatif deger = " + minNegative);
//        System.out.println("En buyuk pozitif deger = " + maxPositive);
            String cumle = "Hayat ziyadesiyle ugrastirici, gor ki bikmiyor";
            cumle = cumle.toLowerCase();

            int counter = 0;
            String []harfler = cumle.split(" ");
            Arrays.sort(harfler);
            for(String w : harfler) {
                switch (w){
                    case "a":
                    case "e":
                    case "i":
                    case "u":
                    case "o":
                        counter++;
                }
            }
        System.out.println(counter);
        System.out.println();

       Arrays.sort(harfler, Comparator.comparingInt(String::length));
        System.out.println(harfler[harfler.length -1]);
        System.out.println(Arrays.toString(harfler));









    }
}
