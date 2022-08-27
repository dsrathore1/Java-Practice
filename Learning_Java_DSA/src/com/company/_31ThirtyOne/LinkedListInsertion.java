package com.company._31ThirtyOne;

import java.util.Scanner;

public class LinkedListInsertion {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void create() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your data :- ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("""
                        Enter 1 for insert at beginning
                        Enter 2 for insert at end
                        Enter 3 for insert at specific location :-\040""");

                int m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        //! Insertion at beginning
                        new_node.next = head;
                        head = new_node;
                    }
                    case 2 -> {
                        //! Insertion at the end
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                    }
                    case 3 -> {
                        //! Insertion at specific location
                        System.out.print("Enter the position of node to be inserted");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                    }
                }
            }
            System.out.print("Do you want to add more element at beginning, if yes, select 1 :- ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traversal() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListInsertion lli = new LinkedListInsertion();

        lli.create();
        lli.traversal();
    }
}
