package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

     int sayilar[] = {25,36,52,21,22,85};
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        int a = sayilar[0];
        int b = sayilar[sayilar.length - 1];
        System.out.println(a+b);
          //1.yol
       int toplam = 0;
        for(int i=0; i<sayilar.length; i++){
            toplam = toplam+sayilar[i];
        }System.out.println(toplam);

        System.out.println();
       //2.yol
        int i =0;
        int total = 0;
        while (i < sayilar.length){
            total = total+sayilar[i];
            i++;

        }System.out.println(total);

        System.out.println();
        //3.yol
        int k = 0;
        int t = 0;
        do{
            t=t+sayilar[k];
            k++;

        }while (k< sayilar.length);
        System.out.print(t);
        System.out.println();
         //4.yol
        int c = 0;
        for(int w : sayilar ){
            c+=w;
        }
        System.out.println(c);








    }


}
