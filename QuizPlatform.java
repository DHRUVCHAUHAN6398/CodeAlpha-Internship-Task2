package Task2;

import java.util.*;
class Account {
    int accNumber;
    String accHolderName;
    double balance;

    public Account(int accNumber , String accHolderName , double balance){
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.balance = balance;
        
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println();
        System.out.println(+amount+" deposited:");
    }
    
    void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println();
            System.out.println(+amount+" withdrown.");
        }else{
            System.out.println("balance is not sufficient to withdraw.");
        }
       
    }

    double checkBalance() {
        return balance;
    }
}

public class QuizPlatform {
   
    private static String john;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Account Holder Name :  ");
        String name = sc.nextLine();
        System.out.print("Enter the Account number :  ");
        int num = sc.nextInt();
        double balance = 0.0;
        Account acc = new Account(123456789 , john , 10000);
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice : ");
 
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter amount to be deposited :  ");
                    double deposit = sc.nextDouble();
                    acc.deposit(deposit);
                    break;
                case 2:
                    System.out.print("\nEnter amount to be withdrawn :  ");
                    double withdrow = sc.nextDouble();
                    acc.withdraw(withdrow);
                    break;
                case 3:
                balance = acc.checkBalance();
                    System.out.println("\nCurrent balance is  "+balance);
                    break;
                case 4:
                    System.out.println("\nExiting...\n");
                    break;
                default:
                    System.out.println("\nInvalid choice");
            }
        } while (choice != 4);
    }
}
