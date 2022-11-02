package arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        String[][] brr = { {"learn", "java", "it"}, {"is", "easy"} };
        int a =0;
        for (String[] w : brr) {
            for(String k : w) {
                if(k.contains("a")){
                    System.out.println(k);
                }
            }
        }

        System.out.println();
       String cumle = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
       cumle.toLowerCase();
       String cumle1[] = cumle.split("");
       int counter = 0;
       for(String w : cumle1) {
           switch (w){
               case "a":
               case "e":
               case "i":
               case "u":
               case "o":
                   counter++;
                   break;

           }
       }System.out.print(counter);












    }
}
