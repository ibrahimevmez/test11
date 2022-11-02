package forloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentPractice3 {
    /*
       Bir derslerin oldugu array olusturun ve elemanlarını ters çevirip ekrana yazdırınız.
            ex:
               arr = {java, python, c#}

           output:
              avaJ
              nohtyp
              #c
  */
    public static void main(String[] args) {

        String[] arr = {"java", "python", "c#"};

        for (int i = 0; i < arr.length; i++) {
            String reverse = "";
            for (int j = (arr[i].length() - 1); j >= 0; j--) {
                reverse += arr[i].charAt(j);
            }
            System.out.println(reverse);
        }

        // avaj
        //nohtyp
        //#c
 /*
                   Bir tamsayı dizisini tersine çevirebilen ve onu yeni dizi olarak döndüren bir program yazın
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

     */



        int [] array = {1,2,3,4,5};
        int[] tersArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tersArray[array.length-1-i]=array[i];

        }System.out.println(Arrays.toString(tersArray));
        /*
            İki tamsayı dizisinden ortak elemanları yazdırabilen bir program yazın
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

     */

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};
        List<Integer> ortak = new ArrayList<>();
       for(int w : arr1) {
           for (int k : arr2) {
               if(w==k){
                   ortak.add(k);
               }
           }

       }
        System.out.println(ortak);
        }


    }





