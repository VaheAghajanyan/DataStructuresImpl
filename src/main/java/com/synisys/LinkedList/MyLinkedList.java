package com.synisys.LinkedList;

public class MyLinkedList {
    private class Node {
        int data;
        Node next;
    }

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAt(int index, int data) {
        if (index == 0)
            insertAtStart(data);

        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node deleted = n.next;
            n.next = deleted.next;
            deleted = null;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void size() {
        if (head == null) {
            System.out.println(0);
        } else {
            int count = 1;
            Node n = head;
            while (n.next != null) {
                count++;
                n = n.next;
            }
            System.out.println(count);
        }
    }


}
