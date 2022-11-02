import java.util.Scanner;

public class IfYeni {
    public static void main(String[] args) {
        //    Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
        //   musteri karti olup olmadigini sorun
        //   Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
        //   Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
        //   alirsa %10 indirim yapin
        Scanner input = new Scanner(System.in);
      /*  System.out.println("Aldiginiz urun adedini giriniz");
        int u = input.nextInt();
        System.out.println("Aldiginiz urunun liste fiyatini giriniz");
        int l = input.nextInt();
        System.out.println("Musteri kartiniz varsa 'E' yoksa 'H' giriniz ");
        char c = input.next().toUpperCase().charAt(0);
        if(u<0 || l<0) System.out.println("Pozitif deger giriniz");

        double sonuc = c=='E' ? (u>10 ? u*l*8/10 : u*l*8.5/10) : (u>10 ? u*l*8.5/10 : u*l*9/10);

        System.out.println(sonuc);*/
        int year = 2020;
        if(year%100==0) {
            if(year%400==0) {
                System.out.println(year + " is lucky leap year");
            }else {
                System.out.println(year + " is not lucky leap year");
            }
        }else {
            if(year%4==0) {
                System.out.println(year + " is simple leap year");
            }else {
                System.out.println(year + " is not simple leap year");
            }
        }
        int i = 1;
        int j = 0;
      /*  switch (i) {
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            case 1 :
                j += 4;
            default :
                j += 2;
        }
        System.out.println("j = " + j); */

        String str = "Teach more, learn more";
        System.out.println(str.replace("more", "less"));


        System.out.println(str.replace("", "/"));


        String str2 = "Java";
        System.out.println(str2.replace("m", "A"));
        String str55 = "Thank you!";
        System.out.println(str55.startsWith("Tha"));

        String s = "Java is Java";
        System.out.println(s.indexOf('a', 4));
        String st = "Learn";
        String t = "Java";

       // System.out.println((st+t).length());
        //prints 9 on the console
        //System.out.println(st.length()+t.length());
        //prints 9 on the console
        System.out.println(s+t.length());
        //prints Learn4 on the consol








    }
}
