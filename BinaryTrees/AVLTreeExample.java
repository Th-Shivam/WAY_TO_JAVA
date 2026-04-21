// Node class for AVL tree nodes
class Node {
    int key;
    int height;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

// AVL Tree class
class AVLTree {
    Node root;

    // Calculate the height of a node
    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Get the maximum of two integers
    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Right rotation (for LL imbalance)
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node t = x.right;
        x.right = y;
        y.left = t;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    // Left rotation (for RR imbalance)
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node t = y.left;
        y.left = x;
        x.right = t;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    // Get the balance factor of a node
    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Recursive insert method with balancing
    private Node insert(Node node, int key) {
        // Standard BST insert
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node; // Duplicate keys are ignored
        }

        // Update height
        node.height = 1 + max(height(node.left), height(node.right));

        // Get balance factor
        int balance = getBalance(node);

        // Left-Left case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // Right-Right case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // Left-Right case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Public insert method
    public void insert(int key) {
        root = insert(root, key);
    }

    // In-order traversal to print the tree (sorted order)
    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Public method to perform in-order traversal
    public void printInOrder() {
        inOrder(root);
        System.out.println(); // New line after printing
    }
}

// Main class to demonstrate AVL tree creation from an array
public class AVLTreeExample {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 25};

        AVLTree tree = new AVLTree();

        // Insert each element from the array
        for (int num : array) {
            tree.insert(num);
        }

        // Print the tree in sorted order to verify
        System.out.println("In-order traversal of the AVL tree:");
        tree.printInOrder();
        // Expected output: 10 20 25 30 40 50 
    }
}