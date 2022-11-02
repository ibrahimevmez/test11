import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Example 1: Kullanici gun numarasini girsin kod gun ismini yazsin
        //           2==>Pazartesi      5==>Persembe ...

        System.out.println("Gun numarasini yaziniz...");
       byte gunNo = input.nextByte();

        if(gunNo==1) {
            System.out.println("Pazar");
        } else if (gunNo==2) {
            System.out.println("Pazartesi");
        } else if (gunNo==3) {
            System.out.println("Sali");
        } else if (gunNo==4) {
            System.out.println("Carsamba");
        } else if (gunNo==5) {
            System.out.println("Persembe");
        } else if (gunNo==6) {
            System.out.println("Cuma");
        } else if (gunNo==7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Gecerli bir gun numarasi yaziniz...");
        }
        //Example 1: Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz
        //           Pazartesi==>Hafta ici        Pazar==>Hafta sonu


        System.out.println("Gun ismi giriniz");
        String gunAdi = input.next();
        if(gunAdi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");
        } else if (gunAdi.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici");
        } else if (gunAdi.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici");
        } else if (gunAdi.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici");
        } else if (gunAdi.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici");
        } else if (gunAdi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");
        } else if (gunAdi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu");
        } else {
            System.out.println("Gecerli bir gun adi yaziniz");
        }
        // 2.Yol
        System.out.println("Gun adi giriniz");
        String g = input.next();
        if (g.equalsIgnoreCase("Cumartesi") || g.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu");
        } else if (g.equalsIgnoreCase("Pazartesi") ||
                   g.equalsIgnoreCase("Sali") ||
                   g.equalsIgnoreCase("Carsamba") ||
                   g.equalsIgnoreCase("Persembe") ||
                   g.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun adi giriniz...");
        }




























    }








































}
