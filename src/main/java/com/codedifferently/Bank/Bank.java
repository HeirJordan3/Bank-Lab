package com.codedifferently.Bank;

public class Bank {
    int balance;

    public Bank(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+ balance);
    }

    public void deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }
    public String toString(){
        return "This is a savings account with " + balance + " saved.";
    }

    public static void main(String[] args) {
        Bank savings = new Bank(2000);

        savings.checkBalance();
        savings.deposit(5000);
        savings.checkBalance();
        savings.withdraw(1000);
        savings.checkBalance();
    }
}
