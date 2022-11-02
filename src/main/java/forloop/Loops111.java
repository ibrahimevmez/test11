package forloop;

import java.util.Scanner;

public class Loops111 {
    public static void main(String[] args) {

        /*Soru 3)
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0'a basmasini soyleyin.

        Kullanici 0'a(Sıfıra) bastiginda
        toplam kac pozitif şayi girdigini
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.*/

          Scanner scanner = new Scanner(System.in);

        int i = 0, toplam = 0, girilenSayi = 1;
        System.out.println("Toplam için bir sayı giriniz.Cikmak icin 0'a basiniz");
        while(girilenSayi > 0)
        {
            System.out.println("Toplam için bir sayı giriniz.");

            girilenSayi = scanner.nextInt();

            toplam += girilenSayi;
             if(girilenSayi==0){
                 break;
             }
            i++;
        }

        System.out.println(i + " tane sayı girdiniz." + " Toplamları : " + toplam);

        int satir = 5;
        for(int ii = 1; ii <=satir; ii++){
            for (int j =1; j<=ii; j++){
                System.out.print("*");
            }System.out.println();
        }
        System.out.println();
        int tekrar=0,sayi=1,negatifSayiAdedi=0,total=0;
        while(sayi> 0){
            System.out.println("Lutfen pozitif sayi giriniz");
            sayi= scanner.nextInt();
            total+=sayi;
            if(sayi>0){
                tekrar++;
            }
            if(sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negatifSayiAdedi++;
                if(sayi==0){
                    break;
                }
            }
        }System.out.println(tekrar + " tane pozitif sayi girdiniz " +negatifSayiAdedi+ " tane negatif sayi girdiniz" +
                " Girdiginiz pozitif sayilarin toplami = " + total);

        System.out.println();
        System.out.println("Sifrenizi giriniz");
        String sifre = scanner.next();


        for(int a = 0; a >0; a++){
            boolean first = sifre.contains("[a-z]");
            boolean second = sifre.contains("[A-Z");
            boolean third = sifre.contains("\\s");
            boolean fourth = sifre.length()>7;
            if(first && second && third && fourth){
                System.out.println("Sifreniz kabul edilmistir...");
            } else System.out.println("Tekrar deneyiniz");
        }
        int tekrarr =0, girilenSayii = 1, topla =0;
        while(girilenSayii >0){
            System.out.println("Toplam için bir sayı giriniz.");
            girilenSayii =scanner.nextInt();
            topla += girilenSayii;
            tekrarr++;
            if(topla >=500){
                break;
            }

        }System.out.println(tekrarr + " tane sayı girdiniz." + " Toplamları :" + topla);














    }
}












