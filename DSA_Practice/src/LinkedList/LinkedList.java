package LinkedList;


class LL {
    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    public void insertValAtFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        System.out.println(head.data);
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertValAtFirst(23);
    }
}