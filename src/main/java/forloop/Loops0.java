package forloop;

public class Loops0 {
    public static void main(String[] args) {

    /*
    example 1 :
    for(int i = 120; i>10; i--) {

        if(i%4==0 && i%6==0) {
            System.out.print(i + " ");
        }
    }
        System.out.println();
    int i = 120;

    while(i>10){
        if(i%4==0 && i%6==0) {
            System.out.print(i + " ");
        }i--;
    }
        System.out.println();
     int a = 120;
      do{
          if(a%4==0 && a%6==0) {
              System.out.print(a + " ");
          }
          a--;
      }while (a>10);  */
        /*
        example 2:

        String s = "accessories";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                System.out.print(c + " ");
            }
            i++;
        }
        System.out.println();
        int a = 0;
        do{
            char c = s.charAt(a);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                System.out.print(c+" ");
            }a++;
        }while (a<s.length()); */

       /* Example 3:
        String k = "runnur";
        String d= "";
        for (int i = k.length()-1; i > -1; i--) {
            char c = k.charAt(i);
            d += c;
        }
            if(k.equals(d)){
                System.out.println(k+ "Palindromdur");
            } else System.out.println(k+ "Palindrom degildir");
        System.out.println();
        String l = "";
        String a = "anna";
        int i = a.length()-1;
        while (i>-1) {
            char c = a.charAt(i);
            l += c;
            i--;
        }
        if(a.equals(l)){
            System.out.println( "Palindromdur");
        }else System.out.println("Palindrom degildir");
        System.out.println();
        String  x = "anna";
        String y = "";
        int z = x.length()-1;
        do{
            char c = x.charAt(z);
            y += c;
            z--;
        }while (z>-1);
          if(x.equals(y)){
              System.out.println("Palindromdur");
          }else System.out.println("Palindrom degildir");*/












    }
}