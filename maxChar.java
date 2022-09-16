import java.util.Scanner;

class maxChar{
    static final int N = 256;

    static char maxString (String in){
       int ctr[] = new int(N);
       int l = in.length();
       for(int i = 0;i<l;i++)
        ctr[in.charAt(i)]++;
        int max = -1 ;
        char result = ' ' ;

        for(int i = 0;i<l;i++){
            if (max < ctr[in.charAt(i)]) {
                max = ctr[in.charAt(i)];
                result = in.charAt(i);
               }
        }

       return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String in = s.nextLine();
        System.out.println("The given string is :" +in);
        System.out.println("Max occuring given string is :" +maxString(in));
        
    }
}