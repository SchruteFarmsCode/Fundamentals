package org.example.DataStructures;

public class BinarySearchTree {
    private BSTNode root;

    public BinarySearchTree() {
        root = null;
    }
    //Metoda dodająca klucz do drzewa:
    public void insert(int key) {
        root = insertRec(root, key);
    }
    private BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }else if (key > root.key) {
            root.right =  insertRec(root.right, key);
        }
        return root;
    }
    //metoda przeszukiwania drzewa w porządku rosnącym:
    public  void inOrderTraversal() {
        inOrderTraversalRec(root);
    }
    private void inOrderTraversalRec(BSTNode root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.println(root.key + " ");
            inOrderTraversalRec(root.right);
        }
    }
}
