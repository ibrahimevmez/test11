package forloop;

public class Loops04 {
    public static void main(String[] args) {
      /* Example 4:
        int num = 223878;
        String sayi = String.valueOf(num);
        String a= " ";
        for(int i= 0; i<sayi.length(); i++) {
           char c = sayi.charAt(i);
            if(sayi.indexOf(c)==sayi.lastIndexOf(c)) {
                a+=c;
            }
        }System.out.println(a);
        System.out.println();

        int i = 0;
        String b = "";
        while (i<sayi.length()) {
            char c = sayi.charAt(i);
            if(sayi.indexOf(c)==sayi.lastIndexOf(c)) {
                b+=c;
            }
            i++;
        }System.out.println(b);
        System.out.println();
        int x =0;
        String q = "";
        do {
            char c = sayi.charAt(x);
            if(sayi.indexOf(c)==sayi.lastIndexOf(c)) {
                q+=c;
            }
            x++;
        }while(x<sayi.length());
        System.out.println(q);
        System.out.println(); */
       /* Example 5:
        int s = 3;
        int st = 5;
        int t = 0;
        for (int i = 0; i<s; i++){
            for(int j = 0; j<st; j++) {
                t+=j;
                System.out.print('A');
            }System.out.println();
        }
        System.out.println();
        int rows = 3;
        int columns = 5;
        int i=1;
        while(i<=rows){
            String x = "";
            for(Integer k=1; k<=columns; k++){
                x = x + "A ";
            }
            System.out.println(x);
            i++;
        }
        System.out.println();
        int rows = 3;
        int columns = 5;
        int i=1;
        do{
            String s = "";
            for(Integer k=1; k<=columns; k++){
                s = s + "A ";
            }
            System.out.println(s);
            i++;
        }while(i<=rows);*/














    }
}
