import java.util.Scanner;

public class StringM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("lutfen ad ve soyadinizi giriniz");
        String s = scanner.nextLine();
        String s2 = s.substring(0,1).toUpperCase() + " " + s.split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(s2); */

        String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
        int p = s.replaceAll("\\S","").length();
        String s2 = s.substring(8,11)+ " " + s.substring(s.length()-1);
        int a = s.indexOf('c');
        int b = s.lastIndexOf('i');
        System.out.println(p);
        System.out.println(s2);
        System.out.println(a);
        System.out.println(b);







    }
}
