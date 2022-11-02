package forloop;

import java.util.Scanner;

public class Loops06 {
    public static void main(String[] args) {


      /*  int a = 5;
        for(int i = 1; i<=5;i++) {
          for(int j = 1; j<=i; j++) {
              System.out.print(j);
          }
            System.out.println();
        }
        System.out.println();
        int x = 5;
        for(int i = 0; i<5;i++) {
            for(int j = 5; j>i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        int rows = 4;
        for(int i = 0; i<=rows; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print('A');
            }
            System.out.println();*/
      /*  }
        System.out.println();
        int r = 4;
        int i =0;
        while (i<=r){
            for(int j = 0; j<=i; j++) {
                System.out.print('A');
            }System.out.println();
            i++;
        }
        System.out.println();
        int rr =4;
        int a =0;
        do{
            a++;
            for(int j = 0; j<a; j++) {
                System.out.print('A');

            }
            System.out.println();
        }while (a<rr);*/
      /*  int  sayi = 3;
        for(int i = 0; i<11; i++) {
            System.out.println(sayi + "x" + i + "=" + sayi*i );
        }
        System.out.println();*/
      /*  int i = 0;
        int sayi =3;
        while (i<10){
            i++;
            System.out.println(sayi + "x" + i + "=" + sayi*i );
        }
        System.out.println();
        int a = 0;
        int b = 3;
        do{
            System.out.println(b + "x" + a + "=" + a*b );
            a++;
        }while (a<11); */

      /*  for(int i = 20; i>=3; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        int i =20;
        while(i>=3){
            System.out.print(i + " ");

            i--;
        }
        System.out.println();
        int a = 20;

        do{
            System.out.print(a+" ");
            a--;
        }while (a>3);*/

      /*  double num = 75.4238;
        String str = String.valueOf(num);
        String s = str.split("\\.")[1];
        int yeni = Integer.valueOf(s);

        int i = 4238;
        int t = 0;
         while (i>0){
             t=t+i%10;

             i/=10;
         } System.out.print(t);
        System.out.println();*/
      /* String a = "Mark";
        int i = a.length()-1;
        String s = "";
        while (i>-1){
            char c = a.charAt(i);
            s+=c;
            System.out.print(c);
            i--;
        }
       System.out.println();
        String x = "Mark";
        String z = "";
        for(int y  = x.length()-1; y>-1; y--){
            char c = x.charAt(y);
            z+=c;
            System.out.print(c);

        }*/
        Scanner input = new Scanner(System.in);
       /* int tekrar = 0, toplam = 0, girilenSayi = 1;

        while (girilenSayi > 0) {
            System.out.println("Toplam için bir sayı giriniz. Çıkmak için 0 giriniz.");
            girilenSayi = input.nextInt();
            toplam += girilenSayi;

            tekrar++;
        }

        System.out.println(tekrar + " tane sayı girdiniz." + " Toplamları : " + toplam);*/
       /* int sum = 0;
        for(int i=3; i<15; i++){
            sum = sum+i;
        }
        System.out.print(sum);
        System.out.println();
        int summ = 0, i = 3;
        while(i<15){
            summ = sum+i;
            i++;
        }
        System.out.println();
        System.out.print(sum);
        System.out.println();
        int s = 0, x = 3;
        do{
            s+=x;

            x++;
        }while (x<15);
        System.out.print(s);*/















    }}