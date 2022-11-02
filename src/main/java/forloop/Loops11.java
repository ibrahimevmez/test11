package forloop;

import java.util.Scanner;

public class Loops11 {
    public static void main(String[] args) {

        /*int x=1, y=15;
        while (x<4){
            y--;
            x++;
        }
        System.out.println(x+ "," +y);*/
   /* int m=10, n=2, sum=0;

    while (m>n){
        m--;
        n+=2;
        sum+=m+n;
    }System.out.println(sum);


     int a=80, b=20;
    while(a>=b){
        a-=10;
        b+=10;
    } System.out.println(a+","+b);
    int x = 110, y = 11;
    do{
        x-=10;
        y+=10;
    }while (x>=y);
        System.out.println(x+","+y);*/


        Scanner scan = new Scanner(System.in);
      /*  System.out.println("Bir String giriniz :");
        String s = scan.nextLine();
        System.out.println("Bir karakter giriniz :");
        char ch = scan.next().charAt(0);
        int firstOccIdx = s.indexOf(ch);
        int lastOccIdx = s.lastIndexOf(ch);
        int counter = 0;
        if(firstOccIdx == lastOccIdx) {
            System.out.println(-1);
        }else {
            for(int i=firstOccIdx+1; i<lastOccIdx; i++) {
                if(s.charAt(i)!=' '){
                    counter++;
                }
            }
            System.out.println(counter);
        }*/
        /*int i =1;
        do{
            if(i!=3){
                System.out.print(i+" ");
            }else {
                continue;
            }
            i++;

        }while(i<5);*/

       /* int i=1;
        do{
            if(i != 3){
                System.out.print(i + " ");
            } else {
                continue;
            }
            i++;
        }while(i<5);*/
        /* int i=1;
        do{
            if(i == 3){
                continue;
            } else if(i == 5){
                System.out.print(i + " ");
                break;
            } else{
                System.out.print(i + " ");
            }
            i++;
        }while(true);*/
   /* int i=6,t=1;
    for(i=6; i>0; i--){
        t*=i;
    } System.out.println(t);
        System.out.println("Bir sayi giriniz");
        int a = scan.nextInt(),total=1;
        do{
            total*=a;
            a--;
        }while (a>1);
        System.out.println(total);*/
       /* int i=0,toplam=0,girilenSayi=1;
        while(girilenSayi>0){
            System.out.println("Toplamak icin pozitif tam sayi giriniz, islemi sonlandirmak icin 0'i tuslayiniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;
            i++;
        }
        System.out.println(i+ " " + "tane sayi girdiniz" +" " + "Toplam= " + toplam);*/


        String s = "Marra";
        String ss = "";
        for(int i = s.length()-1; i > -1; i--){
            char c = s.charAt(i);
            ss += c;

        }System.out.print(ss);
        System.out.println();
        String str = "Kaba";

        //Concatenation yapacaksaniz empty String ("") kullanin
        String ters = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            ters = ters + c;
        }
        System.out.println(ters);

       














    }

}