package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays0000 {
    public static void main(String[] args) {

     int arr1[] = {1, 2, 3};
     int arr2[] = {1, 2, 3};
     int arr3[] = {3, 2, 1};
     // Which ones print true on the console?
     System.out.println(Arrays.equals(arr1, arr3));
     System.out.println(arr1 == arr1);
     System.out.println(Arrays.equals(arr1, arr2));
     System.out.println(arr1.equals(arr2));
     int arr[] = {1, 23, 12, 2, 3};
     Arrays.sort(arr);
     System.out.println(Arrays.binarySearch(arr, 12));
     System.out.println();
//Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz//
     //       [12, 19, 15, 30, 21]  ==>  19 ve 21

     List<Integer> a = new ArrayList<>();
     a.add(12);
     a.add(19);
     a.add(15);
     a.add(30);
     a.add(21);
     System.out.println(a);
     Collections.sort(a);
     int min = Integer.MAX_VALUE;
     for (int i = 1; i < a.size(); i++) {
      min = Math.min(min, a.get(i) - a.get(i - 1));
     }
     System.out.println(min);
     String phoneNumber = "+1-407-640-1256";
     String ar[] = phoneNumber.split("-");
     System.out.println(ar[1]);
     String input = "Hello Welcome to TechPro Education";
     String[] result1 = input.split(" ");
     String[] result2 = input.split("X");
     System.out.println(result1.length + "-" + result2.length);
     System.out.println(Arrays.toString(result2));
     int arrr[] = {21, 22, 23, 24, 25, 26};
     System.out.println(arrr.length);
     System.out.println(arrr[1]);
     String s = "Java, I like Java?";
     String ss[] = s.split("");
     int c = 0;
     for (String w : ss) {
      if (w.equals("a")) {
       c++;
      }
     }
     System.out.println(c);
     System.out.println();


   //  Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
   //  Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

    int aa[] =  {5, 0, 2, 0, 3};
    int yIdx = 0;
    int yeniaa[] = new int[aa.length];
    for(int w : aa) {
     if(w!=0){
      yeniaa[yIdx] = w;
      yIdx++;
     }
    }
     System.out.println(Arrays.toString(yeniaa));







    }

 }


















