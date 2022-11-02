package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task02 {

    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("Portakal",
            "Uzum", "Domates",
            "Sogan", "Patates"));//1. adım
    static List<Double> fiyatListesi = new ArrayList<>(Arrays.asList(12.5,5.3,6.5,8.9,9.0));

    static  double toplamOdenecekTutar;

    public static void main(String[] args) {
        System.out.println("*** HOSGELDINIZ ***");
        musteriSecimi();
    }
    static Scanner input = new Scanner(System.in);
    public static void musteriSecimi() {
        System.out.println("No\t\tFiyatlar\t\t\tUrunler");
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= urunListesi.size(); i++) {
            System.out.print(i);
            for (int j = i - 1; j < i; j++) {
                System.out.println("\t\t" + fiyatListesi.get(j) + "€" + "\t\t\t\t" + urunListesi.get(j));
            }
        }
        System.out.println("Lutfen urun seciniz");
        int secim = input.nextInt();
        System.out.println("Kac kilo almak istiyorsunuz ?");
        int kilo = input.nextInt();
        double urunFiyati = fiyatListesi.get(secim-1);
        double urunToplamTutari = kilo* urunFiyati;
        toplamOdenecekTutar+= urunToplamTutari;
        System.out.println("Devam edecekseniz 1'e, kasa icin 2'ye basiniz.");
        int karar = input.nextInt();
        if(karar== 1){
            musteriSecimi();
        } else {
            kasa();
        }

    }
    public static void kasa(){
        System.out.println("Alisverisinizin toplam tutari : " + toplamOdenecekTutar);
    }


}
