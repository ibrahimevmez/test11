import java.util.Scanner;

public class SoruBankasiJava {
    public static void main(String[] args) {
      /*  Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
        a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
                b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
                c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
                d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
        yazmalıdır.
                e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
        yazmalıdır.
                Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
        görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
        "Geçersiz Ad" */

   /*
   ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
   a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
   b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
   c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalidir.
    */
       /* String eyaletKisaltma = "NY";
        if(eyaletKisaltma.length()>2){
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz ");
        }
        if(eyaletKisaltma.replaceAll("[^a-z]","").length()>0){
            System.out.println("Eyalet kisaltmalari kucuk harf iceremez ");
        }
        if(eyaletKisaltma.replaceAll("[A-Za-z]","").length()>0) {
            System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez ");
        }else {
            System.out.println("dogru");
        } */
        /* Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
        oluşturmak için kod yazınız.
                a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
                b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
                c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
                d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır. */
        double a = 10.2, b=5;
        String operator = "*";
        if(operator.equals("+")){
            System.out.println(a+b);
        }else if(operator.equals("-")){
            System.out.println(a-b);
        }else if(operator.equals("*")){
            System.out.println(a*b);
        }else if(operator.equals("/")){
            System.out.println(a/b);}

      /*  Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
        oluşturmak için kod yazınız.
        kullanici 2 sayi girsin sonra isareti girsin hangi isareti girdiyse sonuc konsolda yazsin.
        ornek: kullanici 22 ve 15 girdi sonra '+' isareti girdi sonuc konsalda "sonuc=37" yazsin
       */

























    }
}
