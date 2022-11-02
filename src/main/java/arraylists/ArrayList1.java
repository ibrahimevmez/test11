package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int t = 0;
        for (int w : myList) {
            t += w;

        }
        System.out.println(t);
        System.out.println();
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(12);
        myList1.add(31);
        myList1.add(7);
        myList1.add(13);
        myList1.add(10);
        int sum = 0;
        for (Integer w : myList1) {
            if (w == 13) {
                break;
            }
            sum = sum + w;
        }
        System.out.println(sum);
        System.out.println();
        List<Integer> myList11 = new ArrayList<>();
        myList11.add(12);
        myList11.add(31);
        myList11.add(7);
        myList11.add(13);
        myList11.add(10);
        int total = 1;
        for (Integer w : myList11) {
            if (w % 2 == 0) {
                total *= w;
            }

        }
        System.out.println(total);
        System.out.println();

        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);
        int index = 0;

        for(Integer w : g) {
            if(w==15){
                index = g.indexOf(15);
                g.set(index, 51);
            }
        }
        System.out.println(g);
        System.out.println();
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        List<Integer> i = new ArrayList<>();
        i.add(13);
        i.add(13);
        boolean a = h.removeAll(i);
        System.out.println(h);
        if(!h.contains(15) && !h.contains(13)){
            System.out.println("Liste 13 ve 15'i icermiyor");
        }else {
            for (int ii = 0; ii < h.size(); ii++) {
                if (h.get(ii) == 15) {
                    int idx15 = h.indexOf(15);
                    h.remove(idx15);

                }
                if (h.get(ii) == 13) {
                    int idx13 = h.indexOf(13);
                    h.remove(idx13);
                }
            }
            System.out.println(h);
        }
        System.out.println();
















    }
}