package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays000 {
    public static void main(String[] args) {
        //1.
        int[ ] a = new int[ ]{12, 8, 13};
        Arrays.sort(a);
        if(a.length%2!=0){
            Integer ortadakiElemaninIndexi = a.length/2;
            System.out.println(a[ortadakiElemaninIndexi]);
        }else{
            Integer ortadakiElemaninIndexi = a.length/2;
            Integer ortadakiEleman = (a[ortadakiElemaninIndexi] + a[ortadakiElemaninIndexi -1])/2;
            System.out.println(ortadakiEleman);
        }
        System.out.println();
        //2.
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie"};
        int minLength = b[0].length();
        for(String w : b) {
            minLength = Math.min(minLength, w.length());
        } for(String w : b) {
            if (minLength == w.length()) {
                System.out.println(w);
            }
        }
        System.out.println();
        //3.
        int[] arr = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(arr);
        int maxNegative = arr[0];
        int minPositive = arr[arr.length - 1];
        for(int w : arr) {
            if(w<0){
                maxNegative =Math.max(maxNegative, w);
            } else if (w>0) {
                minPositive =Math.min(minPositive, w);
            }
        }
        System.out.println(maxNegative+minPositive);
        System.out.println();
        //4.
        String[] bb = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};// n ve k ile bitiyorsa
        String ilkHarf = "";
        for(String w : bb) {
            if(w.endsWith("n") || w.endsWith("k")){
                ilkHarf+=w.charAt(0)+" ";
            }
        }
        System.out.println(ilkHarf);
        //5.
        String[] bbb = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int t =0;
        for (String w : bbb) {
            t+= w.length();
        }
        System.out.println(t);
        //6.
        System.out.println();
        String s = "Apex is an object oriented programming language";
        String ss[] = s.split(" ");
        int counter = 0;
        for(String w : ss){
            if(w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }System.out.println(counter);
        System.out.println();
        //7.
        String str = "Apex is an object oriented programming language";
        str=str.toLowerCase();
        String sss[] = str.split("");
        int top = 0;
        for(String w : sss) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "u":
                case "o":
                    top++;
            }
        }
        System.out.println(top);
        System.out.println();
        //8.
        String[] array = new String[]{"alabama", "pick", "sos", "sets", "pex"};// Ilk ve son karakterleri ayni olanlari bul.
        int toplam = 0;
        for(String w : array) {
            if(w.charAt(0)==w.charAt(w.length()-1)){
                toplam++;
                System.out.println(w);
            }
        }
        System.out.println(toplam);
        System.out.println();
        //9.
        String[] array0 = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String x = "is";
        int tt = 0;
        for(String w : array0) {
            if(w.equalsIgnoreCase(x)){
                tt++;
            }
        }if(tt>0){
            System.out.println(x + " arrayde " +tt+" defa vardir");
        } else System.out.println(x + " arrayde yoktur");
        System.out.println();
        //10.
        String[] array00 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int total = 0;
        for(String w : array00){
            total += w.length();

        }System.out.println(total);
        System.out.println();
        //11.
        Integer[] array000 = new Integer[]{5, 0, 2, 0, 3};
        int []yeniArray000 = new int[array000.length];
        int ilk =0;
        for(Integer w : array000) {
            if(w!=0){
                yeniArray000[ilk]=w;
                ilk++;
            }
        }
        System.out.println(Arrays.toString(yeniArray000));
        System.out.println();
        //12.
//        Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
//        büyük öğeler arasındaki farkı konsolda yazdırınız.
        Scanner scan = new Scanner(System.in);
//        System.out.println("Array uzunlugunu giriniz");
//        int length = scan.nextInt();
//        int[] yeniArray = new int[length];
//        System.out.println("Array uzunlugu= " + length);
//        for(int i = 0; i<length; i++){
//            yeniArray[i]=scan.nextInt();
//        }
//        Arrays.sort(yeniArray);
//        int fark = yeniArray[yeniArray.length-1]-yeniArray[0];
//        System.out.println("En buyuk ve en kucuk deger farki = " + fark);
//        System.out.println();
        //13.
        System.out.println("iki String giriniz :");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);
        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);
        if (s1.length() != s2.length()) {
            System.out.println("Anagram Degil");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Anagram Degil");
        } else if (Arrays.equals(a1,a2)) {
            System.out.println("Anagramdir");
        } else {
            System.out.println("Anagram Degil");
        }


    }









    }

