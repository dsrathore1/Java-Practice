package com.company._32_ThirtyTwo;

import java.util.Scanner;

//? Delete at Beginning in Linked List

public class DeleteLL {
    public static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void createLL() {
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much data you want to enter :- ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print("Enter the data :- ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head != null) {
                new_node.next = head;
            }
            head = new_node;
        }
    }

    public void transverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
        } else {
            System.out.println();
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print("Null\n");
        }
    }

    //* Delete element at beginning
    public void deleteAtFront() {
        Node temp = head;
        temp = temp.next;
        head = temp;
    }

    //* Delete element at end
    public void deleteAtEnd() {
        Node temp = head;
        Node ptr = temp.next;
        while (ptr.next != null) {
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = null;
    }

    public void deleteAtSpecificLocation(int position) {
        Node temp2 = head;
        Node ptr2 = temp2.next;

        for (int i = 0; i < position-1; i++) {
            temp2 = ptr2;
            ptr2 = ptr2.next;
        }
        temp2.next = ptr2.next;
    }

    public static void main(String[] args) {
        DeleteLL dll = new DeleteLL();
        dll.createLL();
        dll.transverse();
        System.out.print("""
                \nWhich delete function you want to perform :-
                Enter 1 for delete the element at beginning\040
                Enter 2 for delete the element at ending\040
                Enter 3 for delete the element at specific location\040
                """);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1 -> {
                dll.deleteAtFront();
                dll.transverse();
            }
            case 2 -> {
                dll.deleteAtEnd();
                dll.transverse();
            }
            case 3 -> {
                dll.deleteAtSpecificLocation(3
                );
                dll.transverse();
            }
        }
    }
}
