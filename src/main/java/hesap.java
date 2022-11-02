import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class hesap {
public static int ikiSayiyiCarp(int a, int b){return a*b;}

  /*
      byte vize3 = 60;
      byte vize4 = 80;
      byte finalNotu = 80;
      int sonuc1 = (vize3 + vize4 + finalNotu ) / 3;
        System.out.println("Final notunu goster:" + sonuc1);
*/
/*

*//*

        String isim = "Enes";
        String soyisim = "Kara";
        System.out.println(isim + " " + soyisim );
*/
        /*
          boolean isTrue = true;
          boolean isFalse = false;
          */
      /* 1.  double gomlekFiyat = 12.99;
        double sapkaFiyat = 23.99;
        double ayakkabiFiyat = 15.99;
        System.out.println("Toplam FIyat:" + (gomlekFiyat + sapkaFiyat + ayakkabiFiyat)); */

       /* 2. float x = 15.99F;
        long y = 13L;
        int z = 12;
        System.out.println("x*y*z=" + (x*y*z)); */

        /* 3. int anapara = 10000;
        int oran = 6;
        int yilDegeri = 3;
        int basitFaiz = anapara * oran * yilDegeri / 100;
        System.out.println("Basit Faiz Degeri:"+ basitFaiz); */

        /* 4. String s = "Sonuc1:";
        String s1 = "Sonuc2:";
        Long a = 123L;
        Long b = 9123456782L;
        System.out.println( s + a+b + " "+ s1 + a*b); */

        /* 5. boolean a = true;
        boolean b = false;
        System.out.println(a + " " + b); */

        /* 6. float kitap = 12.99F;
        float defter = 23.45F;
        float laptop = 34.12F;
        float toplamFiyat = 2 * kitap + 4 * defter + 3 * laptop;
        System.out.println("Toplam Fiyat:" + toplamFiyat); */

        /* 7. [Anlamadim] Scanner scan = new Scanner(System.in);
        System.out.println("2 sayiyi giriniz");

        double n1 = (5.66);
        double n2 = (6.55);
        System.out.println("Degistirmeden Once:" + n1 + " " + n2);
        n1 = n1 + n2;
        n1 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Degistirdikten sonra:" + n1 + "-" + n2); */

        /*  double priceOfNotebook = 12;
        double priceOfBook = 23;
        double total = priceOfBook+priceOfNotebook;
        System.out.println(total); */



     /* int num1 = Integer.MIN_VALUE;
        System.out.println(num1);
  int num2 = Integer.MAX_VALUE;
        System.out.println(num2); */

      /*  int a = 12;
        int b = 6;
        int top = a*b;
        System.out.println(top); */

       /*  double a = 5.0;
        double b = 6.0;
        double c = 7.0;
        double top = (a*b)/c;
        System.out.println(top); */

       /*  int a = 45;
        int b = 13;
        int remainder = a % b;
        System.out.println("Remainder:" + remainder); */

       /* int numA = 2;
        numA = numA + 3;
        System.out.println(numA); */

       /* int numb = 88;
        numb = numb - 23;
        System.out.println(numb); */

       /*  int numc = 20;
        numc = numc*5;
        System.out.println(numc); */

      /*  int numd = 96;
        numd = numd/6;
        System.out.println(numd); */

       /* int numf = 7;
        numf++;
        System.out.println(numf); */

        /* int numa = 56;
        numa--;
        System.out.println(numa); */

       /*  String str1 = "Learn" + " " + "Java";
        System.out.println(str1); */

      /*  String abc = 5 + 9 + "3";
        System.out.println(abc); */

       /* int numa = 2;
       int numb = 3;
       String str1 = "Cok";
       String str2 = "Calis";
        System.out.println(str1 +" "+ str2);
        System.out.println(numa + numb + " " + str1);
        System.out.println(str2 + "2" +"3");
        System.out.println(str1 + (numa-1) ); */

       /* int n1 = 2;
        int n2 = 3;
        String s1 = "Study";
        String s2 = "Hard";
        System.out.println((n1*n2) + "1" + " " + s1 + "-1");  */

        /*  float sade = 4.5656565666545844444444445644444444444444855445454554F;
         float f = 45.555454F;
         double top = sade + f;
        System.out.println(top); */


    public static int ucSayiyiTopla(int a, int b, int c) {return a + b + c;}

    public static double ucSayiyiCarpdorduncudencikar(double a, double b,double c, double d){return d-(a*b*c);}
    /*Scanner input = new Scanner(System.in);
               System.out.println("Yasinizi giriniz");
                int age = input.nextInt();
                System.out.println("Yasinizi giriniz  " + age);
                Scanner input4 = new Scanner(System.in);
                System.out.println("Dikdortgenin kisa kenarini giriniz");
                int a = input.nextInt();
                System.out.println("Dikdotrgenin uzun kenarini giriniz");
                int b = input.nextInt();
                System.out.println("Alan " + (a*b));
                System.out.println("Cevre " +(a+b));*/
    /*Scanner input = new Scanner(System.in);
            System.out.println("Ilk sayiyi giriniz ");
    double sayi1 = input.nextDouble();
            System.out.println("Ikinci Sayiyi giriniz " );
    double sayi2 = input.nextDouble();
            System.out.println(sayi1*sayi2);*/
        public static void main(String[] args) {

         /* 1) Type a program which calculates the area and the perimeter of a square
            whose side length is entered by user.
            Hint 1: Area of a square is length x length
            Hint 2: Perimeter of a square is 4x length

            Scanner input = new Scanner(System.in);
            System.out.println("Karenin kenarini giriniz");
            int a = input.nextInt();
            System.out.println("Karenin Alani " + (a*a));
            System.out.println("Karenin Cevresi " + (4*a));
            Karenin kenarini giriniz
            8
            Karenin Alani 64
            Karenin Cevresi 32  */
        /* 2) Type a program which calculates the cube of a number which is entered by user.
            Hint 1: Cube of a number is a x a x a

            Scanner input = new Scanner(System.in);
            System.out.println("Bir sayi giriniz");
            int sayi = input.nextInt();
            System.out.println("Girdiginiz sayinin kupu " + (sayi*sayi*sayi));
            Bir sayi giriniz
            10
            Girdiginiz sayinin kupu 1000 */

          /* 3) Type a program which calculates the area and the perimeter of a rectangle
            whose length and with are entered by user.
            Hint 1: Area of a rectangle is width x length
            Hint 2: Perimeter of a rectangle is 2x (width + length)

            Scanner input = new Scanner(System.in);
            System.out.println("Dikdortgenin kisa kenarini giriniz");
            int a = input.nextInt();
            System.out.println("Dikdortgenin uzun kenarini giriniz");
            int b = input.nextInt();
            System.out.println("Dikdortgenin alani " + a*b);
            System.out.println("Dikdortgenin cevresi " + 2*(a+b));
            Dikdortgenin kisa kenarini giriniz
            5
            Dikdortgenin uzun kenarini giriniz
            8
            Dikdortgenin alani 40
            Dikdortgenin cevresi 26  */

           /* 4) Type a program which calculates the volume of a rectangular prism
            whose length, width, and height are entered by user.
                    Hint 1: Volume of a rectangular prism is width x length x height

            Scanner input = new Scanner(System.in);
            System.out.println("Dikdortgenler prizmasinin enini giriniz");
            byte e = input.nextByte();
            System.out.println("Dikdortgenler prizmasinin boyunu giriniz");
            byte b = input.nextByte();
            System.out.println("Dikdortgenler prizmasinin yuksekligini giriniz");
            byte y = input.nextByte();
            System.out.println("Dikdortgenler prizmasinin hacmi:" + e*b*y );
            Dikdortgenler prizmasinin enini giriniz
            8
            Dikdortgenler prizmasinin boyunu giriniz
            5
            Dikdortgenler prizmasinin yuksekligini giriniz
            4
            Dikdortgenler prizmasinin hacmi:160 */

            /* 5)Type a program which calculates the area and the perimeter of a circle
            whose radius is entered by user. (Use float)
            Hint 1: Take pi number as 3.14159
            Hint 2: Area of a circle is 3.14159 x radius x radius
            Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
            Hint 4: To get float, use nextFloat()

            Scanner input = new Scanner(System.in);
            System.out.println("Dairenin yaricapini giriniz");
            float y = input.nextFloat();
            System.out.println("Dairenin alani " + y*y*3.14159);
            System.out.println("Daireni cevresi " + 2*3.14159*y);
            /*Dairenin yaricapini giriniz
            1.5
            Dairenin alani 7.0685775
            Daireni cevresi 9.424769999999999 */
            /* 6) Type a program which calculates the perimeter of a triangle whose
            Side lengths are entered by user. (Use byte)
            Hint 1: Perimeter of a triangle is a + b + c
            Hint 4: To get byte, use nextByte()

            Scanner input = new Scanner(System.in);
            System.out.println("UCgenin kisa kenarini giriniz");
            byte k = input.nextByte();
            System.out.println("Ucgenin uzun kenarini giriniz");
            byte u = input.nextByte();
            System.out.println("Ucgenin hipotenusunu giriniz");
            byte h = input.nextByte();
            System.out.println("Ucgenin cevresi: " + (k+u+h));  */
            /* Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
            değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
            float x = 15.99F;
            long y = 13L;
            int z = 12;
            System.out.println("Degiskenlerin carpimi: " + x*y*z   */


































        }


    public static String mobileName = "Samsung";
    public static int mobileFiyat = 40000;
    public void interneteBaglan(){System.out.println("internete Cok Hizli Baglan");}
    public void fotografimiCek(){System.out.println("fotografimi cek ve Instagram'da paylas");}
    /* type casting
    int num = 23;
    long newNum = num;

    byte age = 23;
    short newAge = age;

    long nufus = 9000000000000L;
    int newNufus = (int)nufus;

    short sayi = 20000;
    byte newSayi = (byte)sayi;  */

    int num = 50;
    Integer wrapperNum = 50;

    int sayi = 66;
    Integer wrapperSayi = sayi;
     short nufus = 5555;
     Short wrapperNufus = nufus;

     Double wrapperPrice = 58.99;
     double price = wrapperPrice;


 /*  hesap mobile = new hesap();
        System.out.println(ucSayiyiTopla(44, 55, 55));
        System.out.println(ucSayiyiCarpdorduncudencikar(1.2,1.5,1.1,9.6));
        System.out.println(mobileName);
        System.out.println(mobileFiyat);
        mobile.interneteBaglan();
        mobile.fotografimiCek();*/

           /* System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);
    short say = 555;
    byte newSay = (byte) say;
            System.out.println(newSay); */

























}


























