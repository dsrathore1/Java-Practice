package com.company.Extra;

import java.util.Scanner;

public class LLPractice {
    public static class Node {
        int data;
        Node next;

        //! Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your data :- ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.print("Do you want to add more element at beginning, if yes, select 1 :- ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is not exists");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print("Null");
        }
    }

    public static void main(String[] args) {
        LLPractice ll = new LLPractice();
        ll.creation();
        ll.traverse();
    }
}
