package arraylists;

import java.util.Arrays;

public class ArrayLists02 {
    public static void main(String[] args) {

                // Pre Class - 10. PDF Arrays
                //Soru 3)
                int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
                int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

                int genelDiziUzunluguKisaOlan = Math.min(arr1.length, arr2.length);
                int icDiziUzunlukEnKisaOlani;
                for(int i = 0; i < genelDiziUzunluguKisaOlan; i++)
                {
                    icDiziUzunlukEnKisaOlani = Math.min(arr1[i].length, arr2[i].length);
                    for(int j = 0; j < icDiziUzunlukEnKisaOlani; j++)
                        System.out.println(arr1[i][j] + arr2[i][j]);
                }

    /*
    Soru 4)
    Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini
    birer birer bulan ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana
    yazdiran bir program yaziniz
    (4,5), (6,7)
    Ornek;
    (4,5), (6,7) )
    output: (6, 9, 13)
    1+2+3:6
    4+5-9 6+7:13
    */

                int[][] sayilar1 = {{1, 2, 3}, {4, 5}, {6, 7}};
                int[] sayiToplam = new int[sayilar1.length];
                int toplam = 0, i1 = 0;

                for(int[] w : sayilar1)
                {
                    for(int k : w)
                    {
                        sayiToplam[i1] += k;
                    }

                    i1++;

                }

                System.out.println(Arrays.toString(sayiToplam));

                //Soru 5

                String cumle1 = "Kullanıcının yazdığı bir cümle";
                String[] kelimeler1 = cumle1.split(" ");
                System.out.println(kelimeler1.length);
                int kelimeSayisi = 0;
                for(int i = 0; i < kelimeler1.length; i++)
                {
                    System.out.println(kelimeler1[i]);
                    kelimeSayisi++;
                }
                System.out.println(kelimeSayisi + " tane kelime vardır");

                // Soru 6
                int[] sayilar2 = {3, 5, 7, 13, 25, 33, 37, 41};
                int[] silinecekSayilar = {25, 3, 5}; // Bunları kullanıcıdan almamızı istemiş..
                int[] silineceklerIndexi = new int[sayilar2.length];
                int silineceklerinToplami = sayilar2.length - silinecekSayilar.length;
                int yeniSayilarinIndexi = 0;
                int[] yeniSayilar = new int[silineceklerinToplami];

                for(int i = 0; i < silinecekSayilar.length; i++)
                {
                    for(int j = 0; j < sayilar2.length; j++)
                    {
                        if(sayilar2[j] == silinecekSayilar[i])
                            silineceklerIndexi[j] = j;
                    }
                }

                for(int i = 0; i < silineceklerIndexi.length; i++)
                    if(i != silineceklerIndexi[i])
                    {
                        yeniSayilar[yeniSayilarinIndexi] = sayilar2[i];
                        yeniSayilarinIndexi++;
                    }

                System.out.println(Arrays.toString(yeniSayilar));
            }
        }


















