package varargs;

public class Varargs {
    public static String join(String sss) {
        return sss + "Java";
    }


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Learn");
        sb.append("java");
        System.out.println(sb);
        sb.substring(3);
        System.out.println(sb);
        sb.insert(0,"you");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuilder s = new StringBuilder("John");
        s.append("woo").append("leo").deleteCharAt(6);
        System.out.println(s);
        StringBuilder str = new StringBuilder(7);
        str.append("Java");
        System.out.println(str.capacity() + "," + str.length());
        StringBuilder st = new StringBuilder("LearnJava");
        st.reverse();

        System.out.println(st);
        String str2 = "LearnJava";
        String str3 = "";
        for(int i = str2.length()-1; i>=0; i--) {
            str3 = str3 + str2.charAt(i);
        }
        System.out.println(str3);
        StringBuilder stb = new StringBuilder("Learn ");
        char[] ch = new char[] { 'J', 'A', 'V', 'A' };
        stb.append(ch);
        System.out.println(stb);
        String ss = "Learn";

        System.out.println( ss += "Java");
        String sss = "Learn";
        join("Java");
        System.out.println(sss);
        StringBuilder sb3 = new StringBuilder("LearnLearnLearnLearnLearnLearnLearnLearnLearnLearn");
        System.out.println("Before trim: " + sb3.capacity());
        sb3.trimToSize();
        System.out.println("After trim: " + sb3.capacity());
        StringBuilder sbs = new StringBuilder("StringBuilder");
        System.out.println(sbs.delete(3, 6).toString() + " - " + sbs.length());



    }
    }




