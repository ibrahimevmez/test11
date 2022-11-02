package forloop;

import java.util.Scanner;

public class StudentPractice02 {
    public static void faktoriyelBul(int a) {
        int t = 1;
        for (int i = 1; i <= a; i++) {
            t *= i;
        }
        System.out.println(t);
    }

    public static void fibonacciBul(int a) {
        int x = 1;
        int y = 1;
        int f = 0;
        System.out.println(x + "," + y);
        for (int i = 0; i < a - 1; i++) {
            f = x + y;
            System.out.println(f);
            x = y;
            y = f;
        }
    }

    public static void karekokBulma(int a) {
        double karekok = Math.sqrt(a);
        System.out.println(karekok);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Lutfen yapmak istediginiz islemi giriniz");
            int islem = input.nextInt();
            if (islem == 0) {
                System.out.println("Islem sonlandirildi");
            } else {
                switch (islem) {
                    case 1:
                        System.out.println("Faktoriyelini bulmak istediginiz sayiyi giriniz");
                        int sayi = input.nextInt();
                        faktoriyelBul(sayi);
                        break;
                    case 2:
                        System.out.println("Sayi adedini giriniz");
                        int s = input.nextInt();
                        fibonacciBul(s);
                        break;
                    case 3:
                        System.out.println("Karekokunu bulmak istediginiz sayiyi giriniz");
                        int sa = input.nextInt();
                        karekokBulma(sa);
                            break;
                    default:
                        System.out.println("Gecersiz Islem");
                }
            }


        }while (true) ;

    }
}

