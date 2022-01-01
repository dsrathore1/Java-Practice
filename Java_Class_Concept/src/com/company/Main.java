package com.company;

import java.util.Scanner;

class Bank {
    private float balance;

    public Bank(float openingBalance){
        balance = openingBalance;
    }

    // Withdraw Method
    public void withdraw(float withdrawMoney){
        balance = balance - withdrawMoney;
        System.out.println("Your balance is " + balance + " after withdrawing the money");
    }

    // Deposit Method
    public void deposit(float depositMoney){
        balance = balance + depositMoney;
        System.out.println("Your balance is " + balance + " after deposit the money");
    }

}

public class Main {

    public static void main(String[] args) {
	// Code goes here
        Bank bk = new Bank((float) 4000.245);
        System.out.println("What you wanna do Withdrawing the money or Deposit the money");
        System.out.println("select 1 for deposit or 2 for withdraw money");
        Scanner sc = new Scanner(System.in);

        int keyboard = sc.nextInt();

        if( keyboard == 1){
            long a = sc.nextByte();
            bk.withdraw(a);
        }else {
            float b = sc.nextFloat();
            bk.deposit(b);
        }
    }
}
