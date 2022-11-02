import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // 1.Yol
      /*  System.out.println("Bir sayi giriniz");
        double d = input.nextDouble();
        if(d%2==0){
            System.out.println("Cift Sayi...");
        } if(d%2!=0) {
            System.out.println("Tek Sayi...");
        }
       // 2.Yol
        System.out.println("Bir sayi giriniz...");
        double d = input.nextDouble();
        if(d%2==0) {
            System.out.println("Cift Sayi...");
        }else{ System.out.println("Tek Sayi...");
        }

        System.out.println("Bir sayi giriniz");
        double a = input.nextDouble();
        if(a>0) {
            System.out.println("Pozitif...");
        } else if (a==0) {
            System.out.println("Notr...");
        } else {
            System.out.println("Negatif...");
        }  */

      /* Ask user to enter annual salary, if the salary is more than or equal
        to $80.000 output will be “I accept the offer”, if the salary is between
        $60.000 and $80.000 out put will be “I negotiate to increase”,
        otherwise output will be “I do not accept the offer.” */

       /* System.out.println("Lutfen maasinizin miktarini giriniz...");
        int maas = input.nextInt();
        if(maas>=80000) {
            System.out.println("Teklifi kabul ederim...");
        } else if (maas>60000 && maas<80000) {
            System.out.println("Maas artisi icin goruselim...");
        } else {
            System.out.println("Teklifinizi kabul etmiyorum...");
        }
        System.out.println("Bir ay ismi giriniz...");
        String ayAdi = input.next();
        if(ayAdi.equalsIgnoreCase("Aralik") ||
                   ayAdi.equalsIgnoreCase("Ocak") ||
                   ayAdi.equalsIgnoreCase("Subat")) {
            System.out.println("Kis");
        } else if (ayAdi.equalsIgnoreCase("Mart") ||
                   ayAdi.equalsIgnoreCase("Nisan") ||
                   ayAdi.equalsIgnoreCase("Mayis")) {
            System.out.println("Ilkbahar");
        } else if (ayAdi.equalsIgnoreCase("Haziran") ||
                   ayAdi.equalsIgnoreCase("Temmuz") ||
                   ayAdi.equalsIgnoreCase("Agustos")) {
            System.out.println("Yaz");
        } else if (ayAdi.equalsIgnoreCase("Eylul") ||
                   ayAdi.equalsIgnoreCase("Ekim") ||
                   ayAdi.equalsIgnoreCase("Kasim")) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("Gecerli bir ay ismi giriniz");
        } */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        long sayi = input.nextLong();
        if(sayi%10>=5){
            System.out.println("Son basamağı bir üst ondalığa yuvarla :" + (sayi/10+1)*10);
        }else{
            System.out.println("Son basamağı bir alt ondalığa yuvarla :"+ (sayi/10)*10);}























        }


}






