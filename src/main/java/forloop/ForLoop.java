package forloop;

public class ForLoop {
    public static void main(String[] args) {
        String kelime = "technology";
        for(int i=0; i<kelime.length(); i++){
            char cc = kelime.charAt(i);
            if(cc!='h'){
                System.out.print(cc);
            }
        }
       System.out.println();
        for(int i=0; i<kelime.length(); i++){
            char a = kelime.charAt(i);
            if(a=='h'){
                continue;
            }
            System.out.print(a);
        }
        System.out.println();

       String k = "Ankara";
       for(int i = 0; i<k.length(); i++){
           char ccc = k.charAt(i);
           if(ccc=='r'){
               break;
           }
           System.out.print(ccc);
       }
        System.out.println();
       int a =1;
       for(int i = 7; i<15; i++){
           a=a*i;

       }
        System.out.println(a);
        System.out.println();
        for(int i = 100; i>0; i--){
            if(i%3==0 && i%5==0){
                System.out.print(i);
            }

        }



    }
}
