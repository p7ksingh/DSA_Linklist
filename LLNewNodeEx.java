package com.arr.Linked_List;

import java.util.Scanner;

public class LLNewNodeEx {
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);

            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tails = head;
                while (tails.next != null) {
                    tails = tails.next;
                }
                tails.next = currentNode;

            }
            data = sc.nextInt();

        }
        return head;

    }

    public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
        Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
        if (pos == 0) {
            nodeToBeInserted.next = head;
            // head = nodeToBeInserted; // only updare local head
            return nodeToBeInserted;
        } else {
            int count = 0;
            Node<Integer> prev = head;// @200

            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nodeToBeInserted.next = prev.next;
                prev.next = nodeToBeInserted;
            }
        }
        // print(head);// here get updated value
        return head;// privious head
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insert(head, 100, 0);
        print(head); // value no updated

    }
}
