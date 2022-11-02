package forloop;

import java.util.*;

public class StudentPracticet {
    public static void main(String[] args) {

        int arr1 [][] = { {1,2}, {3,4,5}, {6}  }; //3 //3,0
        int arr2 [][] = { {7,8,9}, {10,11}, {12} }; //3 //

//        int toplam =0;
//        int minUzunluk = Math.min(arr1.length, arr2.length);
//
//        for(int i = 0; i<minUzunluk; i++) {
//            for(int j = 0; j<arr1[i].length; j++){
//                if(j<arr2[i].length){
//                    toplam+=arr1[i][j]+arr2[i][j];
//                    System.out.println("Dis arraylerin " +i+" ic arraylerin " + j+ "indeksinin toplami = " +toplam);
//                }
//            }
//        }

//           int toplam =0;
//           for(int i = 0; i<arr1.length; i++){
//               for(int j=0;j<arr1[i].length;j++){
//                   for(int k =0; k< arr2.length; k++){
//                       for (int l =0;l<arr2[k].length;l++){
//                           if(i==k&&j==l){
//                               toplam=arr1[i][j] + arr2[k][l];
//                               System.out.println("Dis arraylerin "+ i+ ". indeksi ile ic arraylerin "+ k +". indeksinin toplami:"+toplam);
//                           }
//                       }
//                   }
//               }
//        }
/*
 {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}}
     *  Array de $ varsa 3.2 ile carp
     *  Array de £ varsa 4.2 ile carp
     *  elemanlarin toplamini  consola yazdir. sonuc = 374.6

 */
//        String str[][] = {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}};
//
//
//        double toplam = 0;
//        for(String[] w : str){
//            for (String k : w){
//               if(k.contains("$")){
//                   Double v = Double.valueOf(k.replace("$", ""))*3.2;
//                   toplam += v;
//                } else if(k.contains("£")){
//                   Double y = Double.valueOf(k.replace("£", ""))*4.2;
//                toplam +=y;
//               }
//
//            }
//        }
//        System.out.println(toplam);

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        lines.add("Ayse");
        lines.add("Cenk");
        lines.add("Sude");
        lines.add("Fatih");
        lines.add("Aysima");
        System.out.println("Kullanici adinizi giriniz");
        String kullanici = input.next();
        for(String w :lines){
            if(lines.contains(kullanici)){
               kullanici+=rand.nextInt(100000);
                System.out.println("Kullanabilirsinz"+kullanici);
            } else System.out.println("Kullanici adiniz basariyla olsuturulmustur"+kullanici);
        }








    }
}
