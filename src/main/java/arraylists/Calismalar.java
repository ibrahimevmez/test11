package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Calismalar {

    public static void main(String[] args) {
        double fiyatA =100;
        double fiyatB =100;
        double fiyatC =100;


        System.out.println(indirim10(fiyatA));
        System.out.println(indirim20(fiyatB));
        System.out.println(indirim25(fiyatC));

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);


    }
    public static double indirim10(double fiyatA) {

        return fiyatA*=0.90;
    }
public static double indirim20(double fiyatB){
return fiyatB*=0.80;
}
public static double indirim25(double fiyatC){
        return fiyatC*=0.75;
}


public static void degistir (List<Integer> list){
        for(Integer w : list){
            w+=3;
            System.out.println(w+" ");
        }
return;
    }





}