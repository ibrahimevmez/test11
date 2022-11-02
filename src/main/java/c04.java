import java.util.Scanner;

public class c04 {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
        /* System.out.println("Bir karakter giriniz...");
        char ch = input.next().charAt(0);
        if(ch>='A' && ch<='Z') {
            System.out.println("Alfabe");
        } else if (ch>='a' && ch<='z'){
            System.out.println("Alfabe");
        } else {
            System.out.println("Alfabe degil");}


        System.out.println("Bir karakter giriniz...");
        char ch1 = input.next().charAt(0);
        if(ch1>='A' && ch1<='Z' || ch1>='a' && ch1<='z') {
            System.out.println("Alfabe");
        } else {
            System.out.println("Alfabe degil");}

        System.out.println("Sifre giriniz...");
        String sifre = input.next();
        if(sifre.equals("JavaLearner")) {
            System.out.println("Sifre,dogrudur...");
        } else {
            System.out.println("Sifre,yanlistir...");
        } */
        /*Write a program to print absolute value of a number entered by user.
        Absolute Value: If the number is positive or zero return the number itself
        If the number is negative return the number after multiplying by -1
        System.out.println("Bir sayi giriniz");
     long sayi = input.nextLong();
        if(sayi==0 || sayi>0) {
            System.out.println("Pozitif...");
        }else {
            System.out.println("Negatif...");
        }

        System.out.println("Bir fiyat giriniz");
        int fiyat = input.nextInt();
        if(fiyat>1000){
            System.out.println(fiyat-(fiyat*10)/100);
        }else {
            System.out.println("Indirim yok...");
        } */
        System.out.println("Dort basamakli bir sayi giriniz...");
        int sayi = input.nextInt();
        System.out.println("Sonuc= " + (sayi%10 + sayi/1000));




















    }
}
