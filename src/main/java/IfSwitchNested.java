import java.util.Scanner;

public class IfSwitchNested {
    public static void main(String[] args) {

      /*  Nested if() Statement Questions
       1 Type java code by using nested if statement,
                If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
       “  Perfect even number” otherwise, the output will be “Good even number.”
        If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
       “  Perfect odd number” otherwise, the output will be “Good odd number. */
     /*   int a = 61;
        if(a%2==0){
            if(a%3==0){
                System.out.println("Mukemmel Cift sayi");
        } else {
                System.out.println("iyi Cift Sayi");
            }} else if(a%2==1){
            if(a%3==0){
                System.out.println("Mukemmel Tek Sayi");
        }else {
                System.out.println("Iyi Tek Sayi");
            }}*/

      /*  2)Type java code by using nested if() statement.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
         If a year is not divisible by 100 then it must be divisible by 4 */
     /*      int y = 2006;
           if(y%100==0){
               if(y%400==0){
                   System.out.println("A Leap Year");
               } else {
                   System.out.println("Not a Leap Year");
           }}else if (y%100!=0){
                   if(y%4==0){
                       System.out.println("A Leap Year");
               }} else {
                       System.out.println("Not A Leap Year");
                   }
   */   /*  3)
        Type java code by using nested if() statement.
                Ask user to enter a password
        If the initial of the password is uppercase then check if it is ‘A’ or not.
        If it is ‘A’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
        If the initial of the password is lowercase then check if it is ‘z’ or not.
        If it is ‘z’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid */

        Scanner input = new Scanner(System.in);
    /*   System.out.println("Enter your Password");
        String sifre = input.next();
        char ilk = sifre.charAt(0);
        if(ilk>='A' && ilk<='Z'){
            if(ilk=='A'){
                System.out.println("Valid Password");
        }else {
                System.out.println("Invalid Password");
            }}
        else if (ilk>='a' && ilk<='z'){
            if(ilk=='z'){
                System.out.println("Valid Password");
            } else{
                System.out.println("Invalid Password");
        }}*/

        /*1 If the user pressed 1, 2, 3 the program will print the number that is pressed;
        otherwise, program will print "Not allowed".*/
     /*   System.out.println("Bir rakam giriniz");
        byte r = input.nextByte();
        switch (r){

            case 0:
                System.out.println("0");
            break;
            case 1:
        System.out.println("1");
        break;
        case 2:
            System.out.println("2");
            break;
            case 3:
                System.out.println("3");
            break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
            case 9:
                System.out.println("9");
                break;
            default: {
                System.out.println("Lutfen 0,1,2,3,4,5,6,7,8,9 rakamlarindan birini giriniz");
            }}*/

    /*  4.  Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
        Then type a program by using “switch statement” to print “United” for ‘U’
         ”States” for ’S’, and “America” for ‘A’ */

        System.out.println("U,S,A harflerinden birini giriniz");
        String x = input.next().toUpperCase();
        switch (x){
            case "U":
                System.out.println("\"United\"");
                break;
            case "S":
                System.out.println("\"States\"");
                break;
                case"A":
                System.out.println("\"America\"");
                break;
            default:
                System.out.println("Girebileceginiz harfler \'U,S,A\' harfleridir...");
        }



















        }
}
