package stringbldrbuffer;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder s = new java.lang.StringBuilder();

        s.append("hello world");
        System.out.println(s);
        s.insert(1,55);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.delete(1,3);
        System.out.println(s);
        s.toString();



        String a = "hello world";
        java.lang.StringBuilder ss = new java.lang.StringBuilder(a);
        ss.reverse();
        System.out.println(ss);

        LocalDate dobOfAli = LocalDate.of(2002,5,12);
        LocalDate currentDate = LocalDate.now();
        long fark = ChronoUnit.DAYS.between(dobOfAli, currentDate);
        System.out.println(fark);

        LocalDate dobOfA = LocalDate.of(1997,6,4);
        LocalDate currentDate1 = LocalDate.now();
        long f = ChronoUnit.DAYS.between(dobOfA, currentDate1);
        System.out.println(f);

        LocalDate dobOfAA = LocalDate.of(1997,6,4);
        LocalDate y = dobOfAA.plusYears(2).plusMonths(3).minusDays(12);
        System.out.println(y);

        LocalDate aa = LocalDate.of(1923,10,29);
        LocalDate ay = aa.plusYears(45).plusMonths(8).plusDays(5);
        LocalDate vv = LocalDate.of(1993,9,15);
        LocalDate vy = vv.minusYears(24).minusMonths(2).minusDays(11);

        System.out.println("Date of birth of Ali : " + ay);
        System.out.println("Date of birth of Veli : " + vy);

        boolean esitMi = ay.equals(vy);
        System.out.println(esitMi);

        LocalDate Ali = LocalDate.of(2012,11,24);
        LocalDate Veli = Ali.plusYears(3).minusDays(11);
        System.out.println(Veli);

        LocalDate bnm = LocalDate.of(1993,11,24);
        LocalDate cmn = LocalDate.of(2024,11,24);
        long farkk = ChronoUnit.DAYS.between(bnm,cmn);
        System.out.println(farkk);

        LocalDate bugunTarih = LocalDate.now();
        int sonIkiRakam = bugunTarih.getYear()%100;
        System.out.println("yilin son 2 hanesi : " + sonIkiRakam);

//        LocalDate x = LocalDate.of(1996,5,3);
//        LocalDate yy = LocalDate.of(1995,12,4);
//        System.out.println(x.getDayOfMonth()+yy.getDayOfMonth());
//        long ff = ChronoUnit.HOURS.between(yy,x);
//        System.out.println(ff);

        LocalDate z = LocalDate.of(1996,5,3);
        boolean c = z.isLeapYear();
        System.out.println(c);

        LocalDateTime x = LocalDateTime.of(1996, 5, 3, 0, 0);
        LocalDateTime yy = LocalDateTime.of(1995, 12, 4, 0, 0);
        System.out.println(x.getDayOfMonth() + yy.getDayOfMonth());
        long ff = Duration.between(yy, x).toHours();
        System.out.println(ff);

        LocalTime bugunTarihi = LocalTime.now();
        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        int saat = bugunTarihi.getHour();
        if(saat >0 && saat <5){
            System.out.println("'Uyku zamani");
        }else if(saat >8 && saat <16){
            System.out.println("Calisma Zamani");
        }else if(saat >19 && saat <22){
            System.out.println("Aile Zamani");
        }else{
            System.out.println("Kisisel Zaman");
        }

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long saatFarki = ChronoUnit.HOURS.between(almanya,japan);
        System.out.println(saatFarki);

        LocalDateTime dogumTrhAli = LocalDateTime.of(2015, 2, 5, 10, 0, 0);
        ZonedDateTime yerelDogumTrhAli = dogumTrhAli.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime dogumTrhVeli = LocalDateTime.of(2015, 2, 5, 12, 0, 0);
        ZonedDateTime yerelDogumTrhVeli = dogumTrhVeli.atZone(ZoneId.of("America/New_York"));
        long saatFark = ChronoUnit.HOURS.between(yerelDogumTrhAli, yerelDogumTrhVeli);
        System.out.println("Saatler arasi fark : " + saatFark);

        LocalDateTime d = LocalDateTime.of(2011,5,6,10,12,25);










    }
}
