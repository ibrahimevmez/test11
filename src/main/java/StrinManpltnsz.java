import java.util.Scanner;

public class StrinManpltnsz {
    public static void main(String[] args) {


       /* String s = "123-Start";

       // System.out.println(s.replaceAll("\\d", ""));

      // System.out.println(s.replaceAll("\\w", ""));
       // System.out.println(s.replaceAll("[at]", "*"));

        System.out.println(s.replaceAll("\\z", "*")); */
      //  1) Write a program to print counting numbers from 10 to 57 on the console by using for-loop
        for (int i = 10; i < 58; i++) {
            System.out.print(i+" ");
        }
        // Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
        System.out.println();
        for(int i = 100; i>44; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
       //Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop.
        System.out.println();
        for(int i = 200; i>33; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
          for(int i = 100; i>49; i--){
              System.out.print(i+",");
          }
        System.out.println();
          for(int i =1; i<100; i++) {
              if(i%3==0){
                  System.out.print(i+" ");
              }
          }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
          int a= input.nextInt();
          for(int i = a; i<100; i++){
             if(i%3==0){
              System.out.print(i+" ");
          }
          }





    }
}
