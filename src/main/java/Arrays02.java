import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        String isimler[] = new String[5];
        isimler[0] = "yusuf";
        isimler[1] = "ferdi";
        isimler[2] = "jale";
        isimler[3] = "kemal";
        isimler[4] = "hulya";
        System.out.println(Arrays.toString(isimler));
        System.out.println(isimler[3]);

        int t = 0;
        for(String w : isimler){
            t+=w.length();
        }
        System.out.println(t);
        System.out.println();

        char c[] = { 'a','/','*', 'k', 'n', 'm'};
        System.out.println(Arrays.toString(c));

        int i = 0;
        for(char w : c){
            if(w>'A' && w<'z'){
                System.out.print(w + " ");
            }
        }





    }
}
