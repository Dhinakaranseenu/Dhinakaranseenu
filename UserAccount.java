import java.util.Scanner;

public class UserAccount {  
    double deposit, withdraw ;
    double balance = 0;
    public UserAccount(double balance){
        this.balance= balance;
    }
    void deposit(double amount) {
    Scanner s = new Scanner(System.in);
        System.out.println("deposit a balance");
        amount =s.nextInt();
        balance += amount;
    }
    void withdraw(double amount){
        Scanner s = new Scanner(System.in);
        System.out.println("withdraw a balance");
        amount =s.nextInt();
        balance += amount;
    }
    /*void getbalance(double amount){
        Scanner s = new Scanner(System.in);
        System.out.println("getbalance a balance");
        amount =s.nextInt();
        balance += amount;
    }*/
    
    void display(){
        System.out.println(balance);
    }
    public static void main(String[] args) {
        
    }
}
