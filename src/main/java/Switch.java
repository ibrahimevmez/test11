import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       /* 2  write a Java program user will choose answer among A, B, C, or D.
                If the answer is true, output will be “True.” If the answer is false, output will be
          “False”. Correct answer is ‘C’ for the multiple option question. */
     /* 3  Type java code by using switch statement.
                A school has following rules for grading system:
        1. For 50 - C 2. For 80 - B. 4. For 100 - A
        Ask user to enter marks and print the corresponding grade .*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen puaninizi giriniz ");
        byte puan = input.nextByte();
 switch (puan) {
     case 50:
         System.out.println("\'C\'");
         break;
     case 80:
         System.out.println("\'B\'");
         break;
     case 100:
         System.out.println("\'A\'");
         break;
     default:
         System.out.println("Gecerli puan giriniz.Gecerli puanlar:50,80 ve 100'dur...");
 }





























    }
}
