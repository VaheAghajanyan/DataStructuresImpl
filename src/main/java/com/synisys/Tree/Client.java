package com.synisys.Tree;

public class Client {
    public static void main(String[] args) {
        int[] inputArrayElements = {100, 10, 20, 30, 120, 110, 105, 120};
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();
        // Output: 20 30 40 50 60 70 80

        System.out.println("\nSearch 40: " + bst.search(40));
        // Output: Search 40: true

        System.out.println("Search 90: " + bst.search(90));
        // Output: Search 90: false

        bst.delete(30);
        System.out.println("Inorder Traversal after deletion:");
        bst.inorderTraversal();
        // Output: 20 40 50 60 70 80
    }
}
