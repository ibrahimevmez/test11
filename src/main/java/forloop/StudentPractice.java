package forloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentPractice {
    public static void main(String[] args) {
         /*
        arr1={ {1,2}, {3,4,5}, {6} };
      arr2={ {7,8,9}, {10,11}, {12} };

      Yukaridaki multidimensional arraylerin ic arraylerinde ayni indekse sahip elemanlarin toplamini
    ekrana yazdiran kod.*/
      /*  int arr1 [][] = { {1,2}, {3,4,5}, {6}  }; //3 //3,0
        int arr2 [][] = { {7,8,9}, {10,11}, {12} }; //3 //
        int toplam=0;
        int minArrUzunluk = Math.min(arr1.length, arr2.length);

        for(int i=0;i<minArrUzunluk;i++){
            for(int k=0;k<arr1[i].length;k++){
                if(k<arr2[i].length){
                    toplam=arr1[i][k]+arr2[i][k];
                    System.out.println("Dis arraylerin "+i+". indeksi ile ic arraylerin "+ k+". indeksi toplami:" + toplam);
                }

            }
        }*/

        int arr1 [][] = { {1,2}, {3,4,5}, {6}  }; //3 //3,0
        int arr2 [][] = { {7,8,9}, {10,11}, {12} }; //3 //
        //0      1       2
        //2. yol
        int toplam=0;
        for (int i=0; i<arr1.length;i++){
            for (int k=0;k<arr1[i].length;k++){
                for(int j=0;j< arr2.length;j++){
                    for (int m=0;m<arr2[j].length;m++){

                        if(i==j&&k==m){
                            toplam=arr1[i][k]+arr2[j][m];
                            System.out.println("Dis arraylerin "+ i+ ". indeksi ile ic arraylerin "+ k +". indeksinin toplami:"+toplam);
                        }



                    }
                }
            }
        }

        /*
 {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}}
     *  Array de $ varsa 3.2 ile carp
     *  Array de £ varsa 4.2 ile carp
     *  elemanlarin toplamini  consola yazdir. sonuc = 374.6

 */
        String str[][] = {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}};

        double top =0;

        for (String [] w:str) {
            for (String k:w) {
                if (k.contains("$")){
                    //toplam=toplam+

                    top+=Double.parseDouble(k.replace("$",""))*3.2; //valueOf
                }else {
                    top+=Double.parseDouble(k.replace("£",""))*4.2;
                }

            }
        }
        System.out.println(top);

/*
 Rastgele kullanici adi olusturan JAVA kodu yaziniz.
 *  1. Kullanici isimlerinin oldugu listemiz olsun.
 *  2. Kullanicidan ismini isteyelim
 *  3. Kullanicinin girecegi ismin onunde ve sonunda bosluklar olmasin.
 *  4. Kullanici adinin alinabilir olup olmadigina bakalim.
 *  5. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
 *  6. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup bunu kullaniciya sunalim.
 */


        Random rnd = new Random();
        Scanner scan= new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("Esra");
        list.add("Sumeyra");
        list.add("Cumali");
        list.add("Ebru");
        list.add("Mehmet");

        System.out.println("Kullanici isminizi giriniz");
        String kullanici= scan.nextLine().trim();

        if(list.contains(kullanici)){
            kullanici=kullanici+ rnd.nextInt(100000);  //int sayi= (int)(Math.random()*100000)
            System.out.println("Kullanici adiniz daha once alinmistir. "+kullanici+ " bu adi kullanabilirsiniz");

        }else
            System.out.println("Kullanici adiniz basariyla olsuturulmustur."+kullanici);

 /*
    Math.Random() classından 0 ile 1000 arasında üreteceğiniz sayılarda kullanici tarafindan verilen 2 sayinin kac defa
    üretildiğini gösteren bir method create ediniz?

     */

        System.out.println("Lutfen 2 sayi giriniz");
        int x=scan.nextInt();
        int y = scan.nextInt();

        rastgele(x,y);

    }

    public static void rastgele(int a, int b){
        int counterA=0;
        int counterB=0;
        for(int i=0;i<1000;i++){
            int sayi = (int) (Math.random()*1000);
            if(sayi==a){
                counterA++;
            } else if (sayi==b) {
                counterB++;

            }


        }
        System.out.println(a + " sayisi "+ counterA + " defa geldi");
        System.out.println(b + " sayisi "+ counterB + " defa geldi");














    }
}
