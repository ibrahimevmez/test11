package forloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {
        String a = "nazan";
        String b = "";
        for(int i = a.length()-1; i>=0; i--) {
            char c = a.charAt(i);
            b=b+c;
        }
        System.out.println(b);
        if(a.equalsIgnoreCase(b)){
            System.out.println("Palindromdur");
        } else System.out.println("Palindrom degildir");
       Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
       int sayi1 = scanner.nextInt();
       int sayi2 = scanner.nextInt();
       int sum = 0;
       for(int i= sayi1; i<=sayi2; i++){
           sum = sum + i;
       }
        System.out.println(sum);

        System.out.println("10'dan kucuk bir sayi giriniz");
        int sayi = scanner.nextInt();
        int sonuc = 1;
        if(sayi<10) {
            for (int i = 1; i <= sayi; i++) {
                sonuc = sonuc * i;
            }
            System.out.println(sonuc);
        } else System.out.println("10 dan kucuk bir sayi giriniz");


        for(int i= 1; i<4; i++){
            System.out.println("Week" + i);
            for(int l = 1; l<5; l++) {
                System.out.println("Day" + l);
            }
            }







    }
}

