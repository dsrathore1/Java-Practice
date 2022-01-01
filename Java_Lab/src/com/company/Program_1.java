package com.company;

// Person class (Grandparent)
class Person {
    public int age = 23;
    public String address = "29/43 sector Vigyan nagar, Kota(Raj.)";
    public String name = "Ramesh";
    
}


// Customer class (Parent) extends from Person class (Grandparent)
class Customer extends Person {
    public int customer_id = 1;
    public int customer_acc = 121232;
    public String printing = "My name is " + name + " and my age is " + age + " my address is " + address + "my customer id is " + customer_id + "my account no. is " + customer_acc;
}

// Loaner Class (Child) extends from Customer class (Parent)
class Loaner extends Customer {
    public String type = "Loan";
    public int amount = 3000;

    void loaner() {
        System.out.println(printing + " my type is " + type + " my loan amount " + amount);
    }
}

// Depositor Class (Child) extends from Customer class (Parent)
class Depositor extends Customer {
    public String type = "Deposit";
    public int amount = 30000;
    String name = "Umesh";
    int age = 45;

    void depositor() {
        System.out.println("My name is " + name + " and my age is " + age + " my address is " + address + "my customer id is " + customer_id + "my account no. is " + customer_acc + " my type is " + type + " my Deposit amount " + amount);
    }
}

// Main Class
public class Program_1 {
    public static void main(String[] args) {
        Loaner ln = new Loaner();
        Depositor dp = new Depositor();

        ln.loaner();
        dp.depositor();
    }
}