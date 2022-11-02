public class StringManipulations {
    public static void main(String[] args) {
      /*  String a = "Hasan dun cok yoruldu";
        int x = a.replace(" ","").length();
        System.out.println(x); */

      /* Hasta hasta gezme buralarda
        String a = "hasta hasta gezme buralarda";
        String b = a.replace("a","A");
        System.out.println(b);
        String c = a.replace("e","");
        String d = a.replace("hasta","sarhos");
        System.out.println(c);
        System.out.println(d);

        String ogrenciNo ="BC11211569";
        String ogrenciNoYeni = ogrenciNo.replace("BC","");
        System.out.println(ogrenciNoYeni);
        String u = "Ali 13 yasinda, dersem inanma!...";
     String sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("[a-z]", "").replace("A","");
        System.out.println(sonuc);  */
      /*  //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli
          String pwd = "B78c? K!m";
        boolean first = pwd.replace(" ","").length()>7;
        boolean second = pwd.replaceAll("[a-zA-Z]","").replace(" ","").replaceAll("[0-9]","").length()>0;
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        String a = "kalex";
        String  b = a.startsWith("ka") && a.endsWith("m") ? "Harika" : "kotu";
        System.out.println(b); */

























    }
}
