package forloop;
public class Loops10 {
    public static void main(String[] args) {
      /*  for (int i = 1; i <= 6; i++) {
            System.out.print(i + " ");i++;
        }
        System.out.println();
        for ( int j = 0; j <=10; j+=3){
            System.out.print( j + " " );
        }
        System.out.println();
        for ( int j = 10; j >0; j--){
            System.out.print("Hello");
        }
        System.out.println();
        for ( char i = 'f'; i>'a'; i--){
            System.out.print(i + " " );
            i--;
        }
        System.out.println();
        int y = 1;
        for (int i = 0; i<4; i++) {
            y += i;
        }
        System.out.println(y);
        for(int i = 65; i < 68 ; i++){
            System.out.print((char)i);
        }
        System.out.println();
        for(int i = 65; i < 68 ; i++){
            System.out.println(i);
        }
        System.out.println();
        for(int i= 65; i>10; i-=5){
            System.out.print(i + " ");
        }
            String s = "marra";

            for(int i = s.length()-1; i>-1; i--){
                char c = s.charAt(i);
                if(s.indexOf(c)==s.lastIndexOf(c)){
                    System.out.println(c);
                }
            }*/
        /*String s = "Love";
        for(int i = s.length()-1; i>-1; i--){
            char c = s.charAt(i);
            System.out.print(c);
        }

        int k = 1;
        while(k<=8) {
            if(k%2==0) {
                System.out.print(k + " ");
            }k++;
        }
        for(int i =0; i<=8; i+=2){
            System.out.println(i);
        }

        System.out.println();
int i = 1;
int sum = 0;
 while (i<=5){

     sum += i;
     i++;
 }System.out.println(sum);*/
       /* System.out.println();
         int ii = 1;
         int ss = 1;
         while (ii<=4){
             ss = ss * ii;
             ii++;
             System.out.println(ss);
         }*/
       /* int i=1;
        int product=0;
        while(i<=4) {
            product = product * i;
            i++;
        }System.out.println(product);


        int j=1;
        int sum=0;
        while(j<1) {
            sum = sum + j;
            j++;
        }
        System.out.println(sum);*/
       /*  int j=1;
        int sum=0;
        while(j==1) {
            sum = sum + j;
            j++;
        }
        System.out.println(sum);*/

       /* for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }
     int x =0;
        while (x<10){
            x++;
        }
       String m = x>10 ? "greater than " : "lesser than";
        System.out.println(m);*/

        int x = 0, b=0;
        while(x < 10){
            b+=x;
            x++;

        }
        System.out.println(b)                           ;
        String message = x > 10 ? "Greater than" : "Less than";
        System.out.println(message+","+x);







    }
}
