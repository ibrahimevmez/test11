import java.util.Scanner;

public class Soru07 {


        /* 7) Type a program which converts the mile to kilometer. Mile value will be
        entered by user. (Use double)
        Hint 1: km = mile x 1.6
        Hint 2: To get double, use nextDouble()

        Scanner input = new Scanner(System.in);
        System.out.println("Mil degerini giriniz");
        double md = input.nextDouble();
        System.out.println("Km degeri: " + md*1.6);
        Mil degerini giriniz
        3.2
        Km degeri: 5.120000000000001


       /* 8) Type a program which converts the hours to seconds. Hours value will be
        entered by user. (Use long)
        Hint 1: second = hour x 60 x 60
        Hint 2: To get long, use nextLong()

        Scanner input = new Scanner(System.in);
        System.out.println("Saat sayisini giriniz");
        long saat = input.nextLong();
        System.out.println("Saniye: " + saat*60*60);
        Saat sayisini giriniz
        6
        Saniye: 21600 */

        /* 9)Type a program which asks user to enter his/her first name and last name,
                then print it on the console.
                Hint: To get String, use nextLine()

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi yaziniz");
        String name = input.nextLine();
        System.out.println("Soyadinizi giriniz");
        String surname = input.nextLine();
        System.out.println("Ad-Soyad: " +name+surname);
        Adinizi yaziniz
        ibrahim
        Soyadinizi giriniz
        evmez
        Ad-Soyad: ibrahimevmez */

       /* 10) Type a program which asks user to enter his/her full name, and address
        then print them on the console like the full name should be in the first line,
        and the address will be in the second line.
                Hint: To get String, use nextLine()

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadiniz giriniz");
        String as = input.nextLine();
        System.out.println("Adresinizi giriniz");
        String adres = input.nextLine();
        System.out.println("Ad-Soyad: " + as);
        System.out.println("Adres: " + adres);
        Adinizi ve Soyadiniz giriniz
        ibrahim evmez
        Adresinizi giriniz
        sogutlu mah k sokak no 10/8 akcaabat/TRABZON
        Ad-Soyad: ibrahim evmez
        Adres: sogutlu mah k sokak no 10/8 akcaabat/TRABZON */

        /*1) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        short yas = 12;
        int yeniYas = yas;
        2) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
         double fiyat = 2.34;
         float yeniFiyat = (float) fiyat;
         System.out.println(yeniFiyat);
        3.Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
                Sonrasında bu short değişkenin değerini konsolda yazdırınız.
                Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
        double fiyat = 1.2;
        short yeniFiyat = (short) fiyat;
        System.out.println(yeniFiyat); */
/*1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
    bulmak için bir kod yazınız.
    byte min = Byte.MIN_VALUE;
    short max = Short.MAX_VALUE;
System.out.println(min + max);
2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
    yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
    değişken arasındaki farkı yazdırınız.

System.out.println(sayi2 - sayi1);
3) valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?
    parseByte() ilkel tamsayı (primitive integer) tipini (int) döndürürken; valueOf(), ilkel tamsayının
    nesne temsilcisi olan Java.lang.Integer'ı döndürür. Primitive türler yerine, bir tamasyı nesnesini
    isteyebileceğimiz durumlar da vardır.
    Bariz olan bir diğer fark ise; valueOf() bir örnek metod(instance method) iken parseByte() stati */













    public static void main(String[] args) {

        double gomlekFiyati1 = 25.99;
        double gomlekFiyati2 = 36.99;
        double sonuc2 = (gomlekFiyati1 + gomlekFiyati2);
        System.out.println("Toplam Gomlek Fiyati:" + sonuc2);





















    }


}









