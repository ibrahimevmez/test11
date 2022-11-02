import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
       //1.soru
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz");
        double kilo = input.nextDouble();
        boy/=100;
        double bedenKitleIndeksi = kilo/(boy*boy);
        System.out.println(bedenKitleIndeksi);
        if(bedenKitleIndeksi<18.5){
            System.out.println("Zayif");
        }else if(bedenKitleIndeksi>18.5 && bedenKitleIndeksi<25 ){
            System.out.println("Normal");
        } else if(bedenKitleIndeksi>25 && bedenKitleIndeksi<30){
            System.out.println("Fazla Kilolu");
        } else if (bedenKitleIndeksi > 30) {
            System.out.println("Obez");
        }
        //2.soru
        System.out.println("Uc tane sayi giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sayi3 = input.nextDouble();
        if(sayi1>sayi2){
            System.out.println("Buyuk sayi: " + sayi1);
        } else if (sayi2>sayi3) {
            System.out.println("Buyuk sayi: " + sayi2);
        } else System.out.println("Buyuk sayi: " + sayi3);
        // 3.soru
        System.out.println("Birinci vize notunuzu giriniz");
        int vize1 = input.nextInt();
        System.out.println("Ikinci vize notunuzu giriniz");
        int vize2 = input.nextInt();
        System.out.println("Final notunuzu giriniz");
        int finalNotu = input.nextInt();
        int toplamNot=(vize1*30/100)+(vize2*30/100)+(finalNotu*40/100);
        System.out.println(toplamNot);
      if(toplamNot>=90){
          System.out.println("AA");
      } else if (toplamNot>=85) {
          System.out.println("BA");
      } else if (toplamNot>=80) {
          System.out.println("BB");
      } else if (toplamNot>=75) {
          System.out.println("CB");
      } else if (toplamNot>=70) {
          System.out.println("CC");
      } else if (toplamNot>=65) {
          System.out.println("DC");
      } else if (toplamNot>=60){
          System.out.println("DD");
      }else if (toplamNot>=55){
          System.out.println("FD");
      } else if (toplamNot>=50){
          System.out.println("FF");
      } else System.out.println("Gecerli bir not giriniz");
      //4.soru
        System.out.println("Lutfen 3 pozitif tamsayi giriniz ");

        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        if(a+b>c && a-b<c && a+c>b && a-c< b && b+c>a && b-c<a){
            if(a==b && a==c && b==c){
                System.out.println("EskenarUcgendir");
            }else
                System.out.println("Eskenar degildir");
            }else
                System.out.println("Ucgen degildir");




    }
}
