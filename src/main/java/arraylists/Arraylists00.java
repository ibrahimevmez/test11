package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylists00 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add(0,"A");
        list.add(1,"L");
        list.add(2,"C");
        list.add(3,"E");
        list.add(4,"F");
        list.add(5,"B");

         list.set(3,"D");
         list.remove("F");
        Collections.sort(list);
        boolean l = list.contains("L");
        boolean m=  list.contains("M");
        System.out.println(m);

        int s = list.size();
        System.out.println(s);
        list.clear();
        System.out.println(list);
        boolean listBosMu= list.isEmpty();
        System.out.println(listBosMu);









    }
}
