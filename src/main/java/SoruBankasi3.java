import java.util.Scanner;

public class SoruBankasi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Bir sehir ismi giriniz");
        String sehirIsmi = scanner.next();
        String son = sehirIsmi.substring(0,1).toUpperCase() + sehirIsmi.substring(1).toLowerCase();
        System.out.println(son);
        String a = "ahmet";
        String b = "hasan";
        String c = "yusuf";
        int x = a.replaceAll("\\s+", "").length();
        int y = b.replaceAll("\\s+", "").length();
        int z = c.replaceAll("\\s+", "").length();
        System.out.println(x  + y  + z); */
       /* String a = "mnytASLpuy!@#- thyb56  ";
        int b = a.replaceAll("\\W","").length();
        System.out.println(b);

         String x = "1a3Bcf4!...'";
         int y = x.replaceAll("\\d","").length();
        System.out.println(y);
        String s = "ahmet";
        int sonKrkIndex = s.length()-1;
        int ilkKrkAscii= s.charAt(0);
        int sonKrkAscii = s.charAt(sonKrkIndex);
        System.out.println("ilk ve son karakterlerin ASCII degerlerinin toplami: " + (ilkKrkAscii +
                sonKrkAscii)); */
        String s = "Java";
        int a = s.length()-1;
        String b = s.substring(1,a).toUpperCase();
        System.out.println(b);
        String x = "ali ahmet mehmet";
        String y = x.replaceAll("\\s+", "");
        String son = !y.contains(" ") ? "True" : "False";
        System.out.println(son);

        String ss = "ynvbjlkhh";
       String fg = ss.substring(3,ss.length()-1);
        System.out.println(fg);
        String kelime = "john ";
        String trim = kelime.trim();
        boolean sonuc = kelime.equals(trim);
        System.out.println(sonuc);


    }
}
