import java.util.Scanner;

import org.omg.CORBA.OctetSeqHelper;

class SwapWord{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first word :");
        String a = s.nextLine();
        System.out.println("Enter the Second word :");
        String b = s.nextLine();

        System.out.println("Before swap " +a+ "" +b);
        a = a+b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After :" +a+ " " +b);
    }
}