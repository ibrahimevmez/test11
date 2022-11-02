import java.util.Locale;
import java.util.Scanner;

public class SoruBankasi {
    public static void main(String[] args) {
        /*Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
        yazınız.
        Geçersiz BMI değeri < 0
        Zayıf = <18.5
        Normal ağırlık = 18.5–24.9
        Fazla kilolu = 25–29.9
        Obezite = 30 veya daha büyük BMI
        int degerBMI = 12;
        String sonuc = degerBMI<0 ?
                "Geçersiz BMI değeri" : degerBMI<18.5 ?
                "zayif" : degerBMI>18.5 && degerBMI<24.9 ?
                "Normal ağırlık" : degerBMI>25 && degerBMI<29.9 ?
                "Fazla kilolu" : degerBMI>=30 ? "obezite" : "Yanlis veri";
        System.out.println(sonuc); */
       /* Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
          Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
          Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
        String parola = "dgjTU25lh ";
        boolean gecerli = parola.replaceAll("\\s","").length()>7;
        String sonuc = gecerli ? "Gecerli Parola" : "Gecersiz Parola ";
        System.out.println(sonuc); */
        /*
        Nested Ternary kullanarak Apex kodunu yazınız.
            Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
            Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
            Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir */

        Scanner input = new Scanner(System.in);
       /* System.out.println("Bir yil giriniz");
        int yil = input.nextInt();
        String sonuc = yil%100==0 ? (yil/400==0 ? "Artik yil" : "Artik yil degil" ) : (yil/4==0 ? "Artik yil" : "Artik yil degil" );
        System.out.println(sonuc); */
        /*
        Nested Ternary kullanarak;
         Şifreyi kontrol etmek için kodu yazınız.
         8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
         8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır
         */
       /* String p = "kXXXXXXXX";
        String r = p.length()>8 ? (p.startsWith("i") ? "Gecerli": "Gecersiz") :( p.startsWith("K") ? "Gecerli ": "Gecersiz");
        System.out.println(r);

        int a = -25;
        int sonuc =  a<0 ? a*(-1) : a;

        System.out.println(sonuc);

        int a = 26;
        int b = 30;
        int sonuc = a>b ? a : b;
        System.out.println(sonuc);
        System.out.println("Bir sayi giriniz");
        int a = input.nextInt();
        String sonuc = a>0 ? "Pozitif" : a==0 ? "Notr" : a<0 ?  "Negatif" : "Sayi giriniz";
        System.out.println(sonuc);
        System.out.println("Bir ay adi giriniz");
        String ay = input.next().toLowerCase();
        switch (ay){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("kis");
                break;
            default:{
                System.out.println("Dogru bir ay adi giriniz");
            }*/
      /*  }
        System.out.println("Cinsiyetinizi giriniz");
          String cinsiyet = input.next();
        switch(cinsiyet.toLowerCase()){
            case "Kadin":
                System.out.println("Kadin");
                break;
            case "Erkek":
                System.out.println("Erkek");
                break;
            default:
                System.out.println("Digerleri");} */













    }
}
