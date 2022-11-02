package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {
    public static void main(String[] args) {


        //dizimizdeki tekrarsızları yazdıran kodu yazın.
        int[] dizi = {1, 3, 5, 6, 3, 1, 7, 9};
        List<Integer> liste = new ArrayList<>();
        int[] konteynir = new int[dizi.length];
        int count = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (isFind(konteynir, dizi[i])) {
                    konteynir[count++] = dizi[i];
                }
            }
        }
        System.out.println(Arrays.toString(konteynir));
    }


    public static boolean isFind(int[]dizi, int sayi){
        for (int w:dizi)
        {
            if (w == sayi)
            {
                return false;
            }
        }

        return true;
    }

}
