import java.util.Scanner;

class NonRepeatChar{
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter the string");
        String Word = f.nextLine();

        for(char i:Word.toCharArray()){
            if(Word.indexOf(i)==Word.lastIndexOf(i)){
                System.out.println("Non-repeating character :" +i);
                break;
            }
        }
    }
}