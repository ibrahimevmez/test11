import java.util.Scanner;

public class StrinManpltinsReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
        If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
        and print it on the console
        System.out.println("Bir sayi giriniz");
        int a = input.nextInt();
        int b  = a<10 ? a*a : a>=10 ? a*2 : a;
        System.out.println(b); */
       /* Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
         if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
         “This name contains neither ‘a’ nor ‘z’.”
        System.out.println("Cocugunuzun ismini giriniz");
        String ad = input.next();
        String add = ad.contains("a") ? "This name contains 'a'"
                : ad.contains("z") ? "This name contains 'z'" :
                "This name contains neither ‘a’ nor ‘z’." ;
         System.out.println(add); */
       /* Ask user ta enter his/her first and last name. If the first name is longer
        output will be “First name is longer.” If the length of last name is equal
        To the length of last name output will be “First name and last name
        have same length.” Otherwise, output will be “Last name is longer.*/
        System.out.println("Adinizi giriniz");
        String ad = input.next();
        System.out.println("Soyadinizi giriniz");
        String soyAd = input.next();
        String son =  ad.length()>soyAd.length() ? "First name is longer." : ad.length()==soyAd.length() ?
                "First name and last name have the same length." : "Last name is longer";
        System.out.println(son);





















    }
}
