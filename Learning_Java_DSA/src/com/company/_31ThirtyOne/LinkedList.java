package com.company._31ThirtyOne;

import java.util.Scanner;

public class LinkedList {
    static class Node {
        int data;
        Node next;

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
            } else { //* Add the element at the beginning
                new_node.next = head;
                head = new_node;

            }
            System.out.print("Do you want to add more data. If yes, enter 1 :- ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL does not exist");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print("Null");
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.creation();
        ll.traverse();
    }
}

