package java_project_oasis;

import java.util.Scanner;

public class Main {

    public static java_project_oasis.ATM.ATMOperation atmOperation = new java_project_oasis.ATM.ATMOperation();

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int atmNumber = 12345;
        int atmPin = 123;

        System.out.println("Welcome to ATM Machine !!!");

        System.out.print("Enter ATM number: ");
        int atmNumber1 = sc.nextInt();
        System.out.print("Enter ATM pin: ");
        int atmPin1 = sc.nextInt();

        if (atmNumber == atmNumber1 && atmPin==atmPin1){
            System.out.println("Validation Done.");
            while(true) {
                ATMMenu();
            }
        }
        else{
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }

    }

    public static void ATMMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini Statement\n5. Exit\n");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch==1){
            atmOperation.viewBalance();
        }
        else if(ch==2){
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            atmOperation.withdrawAmount(amount);
        }
        else if(ch==3){
            System.out.print("Enter amount to deposit: ");
            double deposit = sc.nextDouble();
            atmOperation.depositAmount(deposit);
        }
        else if(ch==4){
            atmOperation.viewMiniStatement();
        }
        else if(ch==5){
            System.out.println("Collect Your ATM Card. Thanks.");
            System.exit(0);
        }
        else {
            System.out.println("Invalid Choice");
            System.exit(0);
        }
    }
}
