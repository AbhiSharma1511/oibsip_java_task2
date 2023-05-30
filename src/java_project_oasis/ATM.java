package java_project_oasis;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    private double balance;
    private double withdrawAmount;
    private double depositAmount;

    public ATM() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public static class ATMOperation implements ATMOperationInterface {

        ATM atm = new ATM();
        HashMap<Double,String> miniStatement = new HashMap<Double, String>();


        @Override
        public void viewBalance() {
            System.out.println("Available Balance: "+atm.getBalance());
        }

        @Override
        public void withdrawAmount(double withdrawAmount) {
            if (withdrawAmount > atm.getBalance()){
                System.out.println("Insufficient Balance!!!");
            }
            else {
                miniStatement.put(withdrawAmount," Amount Withdraw");
                System.out.println(withdrawAmount + " withdraw Successfully !!");
                atm.setBalance(atm.getBalance() - withdrawAmount);
            }
            viewBalance();
        }

        @Override
        public void depositAmount(double depositAmount) {
            System.out.println(depositAmount +" Deposit Successfully !!");
            miniStatement.put(depositAmount," Amount Deposited");
            atm.setBalance(depositAmount + atm.getBalance());
            viewBalance();
        }

        @Override
        public void viewMiniStatement() {
            for (Map.Entry<Double,String> m : miniStatement.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
}
