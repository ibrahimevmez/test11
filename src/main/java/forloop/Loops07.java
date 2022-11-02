package forloop;

import java.util.Arrays;
import java.util.Scanner;

public class Loops07 {
    public static void main(String[] args) {

        /*int a =1;
        for(int i =3; i<10; i++) {
          a*=i;

        } System.out.println(a);
        System.out.println();
        int i = 3;
        int t = 1;
        while(i<10){
            t*=i;
            i++;

        }
        System.out.println(t);
        System.out.println();
        int x = 3;
        int y = 1;
        do{
            y*=x;
            x++;
        }while(x<10);
        System.out.println(y);
        System.out.println(); */
     /*   char i = 'C';
        String t = "";
        do{

            t+=i;
            i--;
        }while(i>='A');
        System.out.println(t + " ");
        System.out.println();*/
      /*  String s = "Christmas";
        String t = "";
        int i =0;

        do{
           String c = s.substring(i,i+1);
           t+=c;
            if(c.equals("m")){
                break;
            }
            i++;
        }while(i<s.length()-1);
        System.out.println(t);
        System.out.println();
        String a = "";
        String b = "Christmas";
        int x = 0;

        while(x<s.length()){
            String c = b.substring(x,x+1);
            a+=c;
            if(c.equals("m")){
                break;
            }

            x++;
        }
        System.out.println(a);*/
       /* int n = 753;
        int t = 0;
        for(int i=753; i>0; i/=10){
            t+=i%10;

        } System.out.print(t);
        System.out.println();
        int total = 0;
        int a = 753;
        do{
            total+=a%10;
            a/=10;
        }while (a>0);
        System.out.println(total); */

       /* String s = "Hello";
        String t = "";
        for(int i=0; i<s.length(); i++){
            String c= s.substring(i,i+1);
            t+=c;
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }
        System.out.println();
        String ss = "Hello";
        String tt = "";
        int i = 0;
        do{
            String c = s.substring(i,i+1);
            tt+=c;
            i++;
            if(ss.indexOf(c)==ss.lastIndexOf(c)){
                System.out.print(c);
            }
        }while (i<ss.length());*/
      /*  String s = "Java is a strongly typed, object-oriented programming language.";
        String t = s.replaceAll("\\p{Punct}","").replaceAll("\\s", "");
        System.out.println(t);*/
      /*  int y = 6;
        String s= " ";
        for(y=6; y>0; y-- ){
            for(int i=0; i<y; i++ ){
                s+=y;
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*int p = 12133455;
        String a = String.valueOf(p);
        int t = 0;
        for(int i=0; i<a.length(); i++){
            String c = a.substring(i,i+1);

            if(a.indexOf(c)==a.lastIndexOf(c)){
                t= t+ Integer.valueOf(c);
            }
        }System.out.print( t);*/
       /* for(int i = 3; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.print(i);
        }*/
       /* Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
                Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
        olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
        yönlendiriniz.*/
        Scanner input = new Scanner(System.in);
       /* System.out.println("Bir tam sayi giriniz: ");
        int sayi = input.nextInt();
        int count = 0;
        if(sayi > 0){
            if(sayi == 1){
                System.out.println("Girdiginiz sayi bir asal sayidir");

            } else{
                for(int i = 2; i <sayi; i++){
                    if(sayi%i==0){
                        count++;
                    }
                }
            }
               if(count==0){
                   System.out.println("sayi bir asal sayidir");

               }else System.out.println("sayi bir asal sayi degildir");

        }else System.out.println("0'dan buyuk bir sayi giriniz"); */
       /* System.out.println("Bir String giriniz");
        String s = input.nextLine();
        System.out.println("Bir karakter giriniz...");
        char c = input.next().charAt(0);
        int ilk = s.indexOf(c);
        int son = s.lastIndexOf(c);
        int counter = 0;
        if(ilk==son){
            System.out.println(-1);
        }else {
            for(int i = ilk+1; i<son; i++){
                if(s.charAt(i)!=' '){
                    counter++;
                }
            }
            System.out.println(counter);
        }*/


       /* Integer arr[] = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==num) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }*/
         /*printNumbers(100);}
        static void printNumbers(int n) {
            if(n > 0) {
                printNumbers(n-1);
                System.out.print(n + " ");
            }
            return;
        }*/


    }


    }
