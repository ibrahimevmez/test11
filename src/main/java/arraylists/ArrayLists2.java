package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists2 {
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);
        int fark = h.get(2)-h.get(1);
        for(int i = 1; i < h.size(); i++) {
            fark = Math.min(fark, h.get(i) - h.get(i-1));

        } for(int i = 1; i < h.size(); i++) {
            if(h.get(i)-h.get(i-1) == fark){
                System.out.println(h.get(i)+" " +h.get(i-1));
            }
        }
        System.out.println();
       // Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        List<Integer> hh = new ArrayList<>();
        hh.add(12);
        hh.add(31);
        hh.add(7);
        hh.add(13);
        hh.add(10);
        for(Integer w : hh){
            if(w ==7 || w ==10){
                continue;
            }else {
                hh.set(hh.indexOf(w),w+2);
            }
        }
        System.out.println(hh);
        System.out.println();

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double total =0;
        for(String w : myList) {
            Double fiyat = Double.valueOf(w.replace("$", ""));
            total += fiyat;
        }
        System.out.println(total);
        System.out.println();
        List<String> myListt = new ArrayList<>();
        myListt.add("$12.99");
        myListt.add("$23.60");
        myListt.add("$8.25");
        myListt.add("$54.45");
        List<Double> fiyatlar = new ArrayList<>();
        for(String w : myListt){
            Double fiyat = Double.valueOf(w.replace("$", ""));
            fiyatlar.addAll(Collections.singleton(fiyat));
        }
        Collections.sort(fiyatlar);
        double en = fiyatlar.get(0)+fiyatlar.get(fiyatlar.size()-1);
        System.out.println(en);
        System.out.println(fiyatlar.get(0)+ " " +fiyatlar.get(fiyatlar.size()-1));
        System.out.println();
        List<Integer> myListT = new ArrayList<>();
        myListT.add(10);
        myListT.add(31);
        myListT.add(15);
        myListT.add(7);
        myListT.add(15);
        myListT.add(23);
        int counter = 0;
//        for(Integer w : myListT){
//            if(myListT.indexOf(w)!=myListT.lastIndexOf(w)){
//                counter++;
//            }
//        }
//        System.out.println("Tekrarlanan oge sayisi = " + counter);
        for(int w : myListT){
            for(int k : myListT){
                if(w==k){
                    counter++;
                }
            }
        }
        if (counter == myListT.size()){
            System.out.println("Tekrarlanan oge yoktur");
        } else {
            System.out.println("Tekrarlanan en az 1 oge vardir");
        }
        System.out.println();
       // Listede 15 veya 13 varsa, bu elemanları kaldırınız.
       // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        List<Integer> he = new ArrayList<>();
        he.add(10);
        he.add(31);
        he.add(15);
        he.add(13);
        he.add(54);
        he.add(13);
        if(!he.contains(13) || !he.contains(15)){
            System.out.println("Liste 13 ve 15'i icermiyor");
        } else {
            for (int i = 0; i < he.size(); i++) {
                if (he.get(i) == 13) {
                    int idx13 = he.indexOf(13);
                    he.remove(idx13);
                    i--;
                }
                if (he.get(i) == 15) {
                    int idx15 = he.indexOf(15);
                    he.remove(idx15);
                    i--;

                }
            }System.out.println(he);
        }
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.remove(3);
        list.remove("A");
        System.out.println(list);
        int t = 0;
           int []array = { 2,5,3};
           for(int w : array){
               t+= w;
           }
        System.out.println(t);
























    }
}
