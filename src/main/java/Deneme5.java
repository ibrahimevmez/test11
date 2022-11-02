import java.util.Scanner;

public class Deneme5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  System.out.println("Dort basamakli bir sayi giriniz");
        int a = input.nextInt();
        System.out.println("Girdiginiz sayinin birler basamagindaki sayi= " + (a % 10));
        System.out.println("Girdiginiz sayinin onlar basamagindaki sayi= " + (a / 10) % 10);
        System.out.println("Girdiginiz sayinin yuzler basamagindaki sayi= " + (a / 100) % 10);
        System.out.println("Girdiginiz sayinin binler basamagindaki sayi= " + (a / 1000) % 10);


        System.out.println("Dort basamakli bir sayi giriniz");
        int b = input.nextInt();
        System.out.println("Girdiginiz sayinin birler ve yuzler basamgindaki sayilarin toplami= " + (a % 10 + a / 100 % 10));

        System.out.println("Bes(5) basamakli bir sayi giriniz");
        int c = input.nextInt();
        System.out.println("Girdiginiz sayinin birler ve binler basamagindaki sayilarin toplami= " + (c % 10 + c / 1000 % 10));
        System.out.println("Girdiginiz sayinin yuzler ve on binler basamagindaki sayilarin toplami= " + (c / 100 % 10 + c / 10000 % 10));

        System.out.println("Adinizi ve soyadinzi giriniz");
        String adsoyad = input.nextLine();
        char h1 = adsoyad.charAt(4);
        System.out.println("Isminizin 5. harfi: " + h1);
        char h2 = adsoyad.split(" ")[1].charAt(2);
        System.out.println("Soyisminizin 3.harfi: " + h2);  */

        System.out.println("Bir ay ismi giriniz");
        String ayAdi = input.next();
        if (ayAdi.equalsIgnoreCase("Aralik") ||
                ayAdi.equalsIgnoreCase("Ocak") ||
                ayAdi.equalsIgnoreCase("Subat")) {
            System.out.println("Kis mevsimine aittir.");
        } else if (ayAdi.equalsIgnoreCase("Mart") ||
                ayAdi.equalsIgnoreCase("Nisan") ||
                ayAdi.equalsIgnoreCase("Mayis")) {
            System.out.println("Ilkbahar mevsimine aittir.");
        } else if (ayAdi.equalsIgnoreCase("Haziran") ||
                ayAdi.equalsIgnoreCase("Temmuz") ||
                ayAdi.equalsIgnoreCase("Agustos")) {
        System.out.println("Yaz mevsimine aittir.");
        } else if (ayAdi.equalsIgnoreCase("Eylul") ||
                ayAdi.equalsIgnoreCase("Ekim") ||
                ayAdi.equalsIgnoreCase("Kasim")) {
            System.out.println("Sonbahar mevsimine aittir.");
        } else {
            System.out.println("Dogru ay isimleri giriniz.Girmeniz " +
                    "gereken ay isimleri: Aralik,Ocak,Subat,Mart,Nisan," +
                    "Mayis,Haziran,Temmuz,Agustos,Eylul,Ekim,Kasim,Aralik'tir.");
        }








    }









    }

