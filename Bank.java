/*
 * Darin Vidhu A
 * 03 - 07 - 2025
 * 12: 40
 * bank system using constructor
 */

import java.util.*;
public class Bank {
    int acc_number;
    String holder_name;
    int acc_balance;
    
    Bank(int number , String name , int balance ){    
    
        this.acc_number = number;
        this.holder_name = name;
        this.acc_balance = balance;
    
    }
  public   static void Select (){
        System.out.print("\n\nWhat operation do you want to do : ");
        System.out.print("\n1 --- deposit");
        System.out.print("\n2 --- withdraw");
        System.out.print("\n3 --- Check Balance\n\n");
    }

   public static void deposit(int depositamt , int balance){
        Scanner sc1 = new Scanner(System.in);
       
        System.out.print("Enter amount to deposit : ");
        depositamt = sc1.nextInt();
        balance = balance + depositamt;
        System.out.print("Your balance :" + balance);
    }

   public static void withdraw (int withdrawamt , int balance){
        Scanner sc1 = new Scanner(System.in);
       
        System.out.print("Enter amount to withdraw : ");
        withdrawamt = sc1.nextInt();
        balance = balance - withdrawamt;
        System.out.print("Your balance :" + balance);

    }

    public static void CheckBalance(int balance){
       
        System.out.print("balance : " + balance);
    }

    public static void main (String args[]){
        Scanner sc  = new Scanner (System.in);
        int depositamt = 0 , withdrawamt = 0 ;

        System.out.print("Enter the Account number : ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the name : ");
        String name = sc.nextLine();

        System.out.print("Enter the balance :");
        int balance = sc.nextInt();

        Bank b1 = new Bank (number , name , balance);

        System.out.print("\nAccount Number : "  + b1.acc_number);
        System.out.print("\nName : " + b1.holder_name);
        System.out.print("\nBalance : " + b1.acc_balance);

        Select();

        System.out.print("Enter your option: ");
        int option = sc.nextInt();

        switch (option) { 
            case 1:
                deposit(depositamt , balance);
                break;

            case 2 :
                withdraw(withdrawamt , balance);
                break;

            case 3 :
                CheckBalance(balance);
                break;
        }
    }
}

// Have a nice day :)