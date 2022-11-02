
import java.util.Scanner;

public class SoruBankasi01 {
    public static void main(String[] args) {
       /* int ay = 2;
        int yil = 2005;
        int gunSayisi = 0;
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayisi = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                break;
            case 2:
                if (((yil % 4 == 0) && !(yil % 100 == 0)) || (yil % 400 == 0)) {
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            default:
                System.out.println("Gecersiz Ay");
                break;
        }
        System.out.println("Gun Sayisi = " + gunSayisi); */

        Scanner input = new Scanner(System.in);
       /* System.out.println("iki sayi giriniz");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        System.out.println("bir isaret giriniz");
        char is = input.next().charAt(0);
        switch (is){
            case '+':
                System.out.println("Sonuc= " +(s1+s2));
                break;
            case '-':
                System.out.println("Sonuc= " +(s1-s2));
                break;
            case '*':
                System.out.println("Sonuc= " +(s1*s2));
                break;
            case '/':
                System.out.println("Sonuc= " +(s1/s2));
                break;
            default:
                System.out.println("yanlis"); */

        /*Ask user to enter password, if the password is okay for the following conditions output will be
        “Your password is created successfully.” If the password is not okay for any of the following conditions
        Output will be “Enter a new password according to the give conditions”
        1.First letter must be uppercase
        2.Last letter must be lowercase
        3.Password must contain 6 character. */

     /*  System.out.println("Sifre giriniz");
        String sifre = input.next();
        boolean ilkHarf = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
        boolean sonHarf =  sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
        boolean harfsayisi = sifre.length()==6;
        boolean gecerli = ilkHarf && sonHarf && harfsayisi;

        String  sonuc = gecerli  ? "Sifreniz basariyla olusturulmustur" : "Sifrenizi verilen kurallara gore tekrar olusturunuz";
        System.out.println(sonuc);
*/



      /*  Ask user ta enter his/her first name, last name and Social Security Number.
                Then type a program which makes
        a) initials of the first name and the last name in uppercase,
                other characters will be in lowercase.
                b) all characters except last 4 characters of the Social Security Number “ * ”.
        For example; Suleyman Alptekin *****5678 */

     /*  System.out.println("Enter your first name, last name and Social Security Number");
        String firstName = input.next();
        String lastName = input.next();
        String socialSecurityNumber = input.next();
        String a = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        String b = lastName.toUpperCase();
        boolean d = socialSecurityNumber.length()==9;
        String c = socialSecurityNumber.substring(0,5).replaceAll("[0-9]", "*") + socialSecurityNumber.substring(6,9) ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); */


















    }

    }

