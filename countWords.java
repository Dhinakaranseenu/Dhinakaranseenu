import java.util.Scanner;

class countWords{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the sentence ");
        String st = in.nextLine();

        String words[] = st.split("\\s+");

        System.out.println(" Nuber of words :" +words.length);



    
    }
}