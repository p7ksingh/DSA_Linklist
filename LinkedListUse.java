package com.arr.Linked_List;

public class LinkedListUse {
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n1.next = n2;
        System.out.println("n1: " + n1 + " n1.data: " + n1.data + "n1.next: " + n1.next);
        n2.next = n3;
        System.out.println("n2: " + n2 + " n2.data: " + n2.data + "n2.next: " + n2.next);

        n3.next = n4;
        System.out.println("n3: " + n3 + " n3.data: " + n3.data + "n3.next: " + n3.next);

        // n4.next = null;
        System.out.println("n4: " + n4 + " n4.data: " + n4.data + "n4.next: " + n4.next);

        return n1;// first node is heade

    }

    // public static void print(Node<Integer> head) {
    // System.out.println(head.data);
    // System.out.println(head.next.data);
    // System.out.println(head.next.next.data);
    // System.out.println(head.next.next.next.data);
    // System.out.println(head.next.next.next.next);
    // }
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Node<Integer> head = createLinkedList();
        // print(head);
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node2.next = node1;
        print(node2);

    }
}
