/**
 * Node class for the Splay Tree.
 */
class SplayNode<T extends Comparable<T>> {
    T data;
    SplayNode<T> left, right, parent;

    SplayNode(T data) {
        this.data = data;
        this.left = this.right = this.parent = null;
    }
}

/**
 * Splay Tree implementation in Java.
 */
public class SplayTree<T extends Comparable<T>> {
    private SplayNode<T> root;

    public SplayTree() {
        root = null;
    }

    /**
     * Rotates the given node up one level toward the root.
     */
    private void rotate(SplayNode<T> x) {
        SplayNode<T> p = x.parent;
        SplayNode<T> g = p.parent;
        if (p.left == x) {
            // Right rotation
            p.left = x.right;
            if (x.right != null) x.right.parent = p;
            x.right = p;
            p.parent = x;
        } else {
            // Left rotation
            p.right = x.left;
            if (x.left != null) x.left.parent = p;
            x.left = p;
            p.parent = x;
        }
        x.parent = g;
        if (g != null) {
            if (g.left == p) g.left = x;
            else g.right = x;
        } else {
            root = x;
        }
    }

    /**
     * Splays the given node to the root using zig, zig-zig, or zig-zag.
     */
    private void splay(SplayNode<T> x) {
        while (x.parent != null) {
            SplayNode<T> p = x.parent;
            SplayNode<T> g = p.parent;
            if (g == null) {
                // Zig
                rotate(x);
            } else if ((p.left == x) == (g.left == p)) {
                // Zig-zig
                rotate(p);
                rotate(x);
            } else {
                // Zig-zag
                rotate(x);
                rotate(x);
            }
        }
    }

    /**
     * Inserts a new node with the given data.
     */
    public void insert(T data) {
        if (root == null) {
            root = new SplayNode<>(data);
            return;
        }
        SplayNode<T> newNode = new SplayNode<>(data);
        SplayNode<T> current = root;
        SplayNode<T> parent = null;
        while (current != null) {
            parent = current;
            if (data.compareTo(current.data) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        newNode.parent = parent;
        if (data.compareTo(parent.data) < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        splay(newNode);
    }

    /**
     * Searches for the node with the given data and splays it to the root.
     * Returns true if found.
     */
    public boolean search(T data) {
        SplayNode<T> current = root;
        while (current != null) {
            int cmp = data.compareTo(current.data);
            if (cmp == 0) {
                splay(current);
                return true;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    /**
     * Deletes the node with the given data.
     */
    public void delete(T data) {
        if (root == null) return;
        SplayNode<T> current = root;
        while (current != null) {
            int cmp = data.compareTo(current.data);
            if (cmp == 0) {
                splay(current);
                // Now root is the node to delete
                if (root.left == null) {
                    root = root.right;
                    if (root != null) root.parent = null;
                } else if (root.right == null) {
                    root = root.left;
                    if (root != null) root.parent = null;
                } else {
                    // Two children: splay left child, then attach right subtree
                    SplayNode<T> leftMax = root.left;
                    while (leftMax.right != null) leftMax = leftMax.right;
                    splay(leftMax);
                    leftMax.right = root.right;
                    if (root.right != null) root.right.parent = leftMax;
                    root = leftMax;
                }
                return;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }

    /**
     * Performs an in-order traversal and prints the tree.
     */
    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(SplayNode<T> node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    /**
     * Main method for testing.
     */
    public static void main(String[] args) {
        SplayTree<Integer> tree = new SplayTree<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        System.out.print("In-order traversal: ");
        tree.printInOrder();  // Output: 3 5 7 10 15
        System.out.println("Search 7: " + tree.search(7));  // true
        tree.delete(5);
        System.out.print("After delete 5: ");
        tree.printInOrder();  // Output: 3 7 10 15
    }
}