package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        int yas[] = {15, 22, 33, 49, 51, 60, 75, 8};
        Arrays.sort(yas);
        int ilk = yas[0], son = yas[yas.length - 1];
        System.out.print(ilk + son);

        int total = 0;
        for (int w : yas) {
            total += w;
        }
        System.out.print(total);
        System.out.println();
        String names[] = {"Jack", "Busra", "Cenk", "David", "Esra", "Jane"};

        int toplam = 0;
        for (String w : names) {
            toplam += w.length();
        }
        System.out.print(toplam);
        char[] c = {'A', 'b', '5', '/', '!', '6'};
        for (char w : c) {
            if (w >= 'A' && w <= 'z') {
                System.out.print(w + " ");
            }
        }
        System.out.println();
        for (String w : names) {
            if (w.equals("Esra")) {
                break;

            }
            System.out.println(w);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int ogrenciSayisi = input.nextInt();
        System.out.println("Islemi sonlandirmak icin 0'a basiniz..");
        String ogrenciIsimleri[] = new String[10];
        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("Lutfen " + i + " .ogrencinin ismini giriniz");
            String ogrenciIsmi = input.next();
            if(ogrenciIsmi.equals("0")){
                break;
            }
            ogrenciIsimleri[i-1] = ogrenciIsmi;
         }
        System.out.println(Arrays.toString(ogrenciIsimleri));
        System.out.println();
        int s[] = {0,5,62,25,0,31,2,0};
        int yeniS[] = new int[s.length];
        int idx = 0;
        for(int i = 0; i<s.length; i++){
            if(!(s[i]==0)){
                yeniS[idx] = s[i];
                idx++;
            }

        }System.out.println(Arrays.toString(yeniS));
        System.out.println();
        int eleman =62, counter = 0;
        for(int w : s){
            if(w==eleman){
                counter++;
            }
        } if(counter>0){
            System.out.println(eleman+" arrayde " + counter+ " defa var");
        } else System.out.println("Eleman arrayde yok");
        System.out.println();
        String cumle = "Java kolaydir calisana, ne kolay ki calismayana.";
        cumle = cumle.replaceAll("\\p{Punct}","");
        String kelimeler[] = cumle.split(" ");
        Arrays.sort(kelimeler, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(kelimeler));






















    }





        }












