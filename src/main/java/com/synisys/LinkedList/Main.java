package com.synisys.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.deleteAt(1);
        list.show();
        list.size();
    }
}
