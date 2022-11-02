import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

       /* 1) Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
        the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd” */
        Scanner input = new Scanner(System.in);
       /* System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();
        String sonuc = sayi%2==0  ? "Sayi,cifttir." : "Sayi tektir.";
        System.out.println(sonuc);
         2. Type java code by using ternary and if-else. Ask user to enter two integers
           Write a program to print the minimum one on the console.
        System.out.println("Iki sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int kucuk = a<b ? a : b;
        System.out.println(kucuk); */
        /* 3) Type java code by using ternary.
           Write a program to print absolute value of an integer entered by user.
          int ab = 25;
          int abs = ab<0 ? ab*-1 : ab;
          System.out.println(abs); */
        /* 4) Type java code by using ternary.
          Take values of length and width of a rectangle from user and check if it is square or not.
         System.out.println("Dikdortgenin kisa ve uzun kenarlarini giriniz");
         int k = input.nextInt();
         int u = input.nextInt();
         String ne = k==u ? "Bu,karedir." : "Bu,kare degildir.";
         System.out.println(ne); */
         /* 5.Ask user to enter a String. If the String has 2 characters, output will be
            “It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
          System.out.println("Bir kelime giriniz");
          String kelime = input.next();
          String girdi = kelime.length()==2 ? "Bu,mevcut kisalmalar icin gecerlidir" : "Bu,mevcut kisalmalar icin gecerli degildir";
          System.out.println(girdi); */
          /* 6.Ask user to enter an integer. If the number has 3 digits, output will be
          “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
          How can you decide the number of digits of an integer ? */
           /*  7.Ask user ta enter a number. If the number is less than 10 and greater
               than or equal to 0, calculate its cube. Otherwise, calculate its square.
               Cube of a = a*a*a Square of a = a*a

          System.out.println("Bir sayi giriniz");
          int num = input.nextInt();
          int islem = num>=0 && num<10 ? num*num*num : num*num;
          System.out.println(islem); */
        /* Example: Type java code by using nested ternary.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
                If a year is not divisible by 100 then it must be divisible by 4.
        System.out.println("Bir yil giriniz");
         int yil = input.nextInt();
         String artikYil = yil%100==0 ? (yil%400==0 ? "Artik YIl" : "Artik Yil Degil") :(yil%4==0 ? "Artik YIl" : "Artik Yil Degil");
        System.out.println(artikYil); */
       /* System.out.println("Bir sayi giriniz");
        int a = input.nextInt();
        String sayi = a>=0 && a<10  ? "Rakam" : a>10  && a<100 ? "Iki Basamakli Sayi" : "Daha Buyuk Sayi";
        System.out.println(sayi);
        System.out.println("Bir harf giriniz");
        char c = input.next().charAt(0);
        String  harf = c>='a' && c<='z' ? "kucuk harf" : c>='A' && c<= 'Z' ? "BUYUK HARF" : "Girdiginiz karakter, harf degil ";
        System.out.println(harf);

        System.out.println("Bir sayi giriniz");
        int a = input.nextInt();
        String sayi1 = a>100 && a<1000 ? "Uc basamakli sayi" : "Uc basamakli sayi degil";
        System.out.println(sayi1); */



















    }
}
