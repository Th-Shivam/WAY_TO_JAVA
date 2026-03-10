class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SumOfNodes {

    static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);

        return root.data + leftSum + rightSum;
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        int result = sumNodes(root);
        System.out.println("Sum of all nodes = " + result);
    }
}
