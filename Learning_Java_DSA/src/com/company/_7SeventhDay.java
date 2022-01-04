package com.company;

import java.util.Scanner;

class Person {
    int balance = 100000;

    void student() {
        System.out.println("Deposit your Student fees -> ");
        Scanner scan = new Scanner(System.in);
        int fee = scan.nextInt();
        balance = balance - fee;
        System.out.println("Your balance after deposit the student fee " + balance);
    }

    void employee() {
        System.out.println("Add your salary to the balance -> ");
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        balance = balance + salary;
        System.out.println("Your amount after deposit of salary into your account " + balance);
    }

    void customer() {
        System.out.println("Your fixed account money -> ");
        Scanner scan = new Scanner(System.in);
        int addedMoney = scan.nextInt();
        if (addedMoney <= 200000) {
            balance = balance + addedMoney;
            System.out.println(balance);
        } else {
            System.out.println("Your total balance is -> " + balance);
        }
    }
}

public class _7SeventhDay {
    public static void main(String[] args) {
        /*
        * Example - Successful Transaction
        Input:
        30 120.00

        Output:
        89.50

        * Example - Incorrect Withdrawal Amount (not multiple of 5)
        Input:
        42 120.00

        Output:
        120.00

        * Example - Insufficient Funds
        Input:
        300 120.00

        Output:
        120.00
*/

        Scanner scan = new Scanner(System.in);

        int withdraw = scan.nextInt();
        double amount = scan.nextDouble();

        if (withdraw % 5 == 0) {
            if (withdraw <= 2000 && amount <= 2000) {
                double result = (amount - withdraw) - 0.50;
                System.out.println(result);
            }
        } else if (withdraw > amount) {
            System.out.println(amount);
        } else {
            System.out.println(amount);
        }

        /*
Hello I am a person having multiple role like Student(fee), employee(salary) and customer(fixed saving account) of bank. How to represent my current assets after performing each role.
*/
        Person pr = new Person();
        pr.student();
        pr.employee();
        pr.customer();
    }
}
