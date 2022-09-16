import java.util.Scanner;

class vowels{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println(" Enter the string");
        String in = v.nextLine();

       String v1 = in.replaceAll("[aeiou]","");
       System.out.println("Removing vowels :" +v1);
    }
}