package forloop;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
     /* Soru 6) Interview Question
      Kullanicidan 100'den kucuk bir tamsayi isteyin.
      1'den başlayarak girilen sayiya kadar tum sayilari yazdirin.
      Ancak;
      -sayi 3'un kati ise şayi yerine "Java" yazdirin.
      -sayi 5'in kati ise şayi yerine "Güzeldir" yazdirin.
      -sayi hem 3'un hem 5'in kati ise şayi yerine "Java Güzeldir" yazdirin. */

        Scanner input = new Scanner(System.in);
       /* System.out.println("0 ve 100 arasinda bir tam sayi giriniz");
        byte sayi = input.nextByte();
        if(sayi>0 && sayi<100 ){
            for(int i = 1; i<sayi; i++) {
              if(i%3==0){
                  System.out.println("java");
              } else if (i%5==0){
                  System.out.println("guzeldir");
              } else if (i%3==0 && i%5==0 ){
                  System.out.println("java guzeldir");
              } else System.out.println(i+"");
            }
        } else System.out.println("0'dan buyuk ve 100'den küçük bir sayi giriniz");

       String a = "Hizli";
       String ters1 = "";
       for(int i = a.length()-1; i>=0; i--){
           char c = a.charAt(i);
           ters1 = ters1 + c;

       }System.out.print(ters1);*/



        for(int i = 1; i<5; i++){
            for(int k = 1; k<=i; k++){
                System.out.print(" "+ k);
            }
            System.out.println();
        }
         char ch = '*';
        for (int b = 5; b>=1; b--){
            for(int l = 1; l<=b; l++){
                System.out.print(" "+ ch);
            }
            System.out.println(" ");
        }
        System.out.println();
        int a = 3;
        int t = 0;
        while (a<11){
            t+=a;

            a++;
        }System.out.print(t);
        System.out.println();
        double aa = 24.5673;
        String yeniSayi = String.valueOf(aa);
        String b = yeniSayi.split("\\.")[1];
        int sayininSonHali = Integer.valueOf(b);
        int toplam = 0;
        do{

            toplam+=sayininSonHali%10;
            sayininSonHali/=10;
        } while(sayininSonHali>0);
        System.out.println(toplam);
        System.out.println();
        while(sayininSonHali>0){
             toplam += sayininSonHali%10;
            System.out.println(toplam);
            sayininSonHali/=10;
        }
        System.out.println();
        for(int i = 5673; i>0; i/=10){
         toplam+=i%10;
        }System.out.println(toplam);







    }
}
















