import java.util.Scanner;

class ReverseWords{
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String line = d.nextLine();

        String s[] = line.split(" ");

        String ans = " ";
        for(int i = s.length-1;i>=0;i--){
            ans += s[i]+ " ";
        }
            System.out.println("Reversed String :");
            System.out.println(ans.substring(0, ans.length()-1));

            

        }
    }
