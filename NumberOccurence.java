import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class NumberOccurence{
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter the sentance");
        String str = no.nextLine();

        Map<String,Integer> hashMap = new HashMap<String,Integer>();

        String[] words =str.split(" ");
        for(String word : words){
            Integer integer = hashMap.get(word);
            if(integer == null){
                hashMap.put(word, 1);
            
            }
            else{
                hashMap.put(word, integer+1);
            }
        }
        System.out.println(hashMap);
    
    }
}