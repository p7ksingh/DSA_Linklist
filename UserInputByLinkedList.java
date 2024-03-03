package com.arr.Linked_List;

import java.util.Scanner;

public class UserInputByLinkedList {
    private static Node<Integer> input() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                // Node<Integer> tail = head; //make tail to head
                // while (tail.next != null) {
                // tail = tail.next;
                // }
                tail.next = currentNode;
                tail = currentNode;
            }
            data = sc.nextInt();

        }
        return head;

    }

    private static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        print(head);
    }

}
