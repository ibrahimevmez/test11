public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println("Hi");
        }
        System.out.println();
        for (int i = 55; i<66; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 52; i>44; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 85; i<100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 96; i>53; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(int i = 2; i>10; i/=2){
            System.out.print(i + " ");
        }
        System.out.println();
        String a = "Java";
        for(int i = 0; i<a.length(); i++){
            System.out.print(a.charAt(i) + "*");
        }
        System.out.println();
        String ik = "Ibrahim";
        for(int i = 0; i<ik.length(); i++){
            System.out.print(ik.charAt(i)+"+");
        }
        System.out.println();
        String ilk = "Helloooo";
        for(int i = 0; i<ilk.length(); i++){
            char c = ilk.charAt(i);
            if(ilk.indexOf(c)!=ilk.lastIndexOf(c)){
            System.out.print(c);
        }
        }
        for (int i = 1; i<6; i++){
            System.out.println(i*i);
        }
        System.out.println();
        for(int i= 0; i<101; i++){
            System.out.print(i);
        }









    }
}
