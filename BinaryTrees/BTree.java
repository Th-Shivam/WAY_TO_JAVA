package BinaryTrees;

class Node{
  int data ;
  Node left ;
  Node right ;

  Node(int data){
    this.data = data ;
    this.left = null ;
    this.right = null ;
  }
}

class BinaryTree{
  Node root ;

  BinaryTree(){
    this.root = null ;
  }

  public void inOrder(Node node){
    if(node == null){
      return ;
    }
    inOrder(node.left) ;
    System.out.print(node.data + " ") ;
    inOrder(node.right) ;
  }

  public void preOrder(Node node){
    if(node == null){
      return ;
    }

    System.out.print(node.data + " ") ;
    preOrder(node.left) ;
    preOrder(node.right) ;
  }

  public void postOrder(Node node){
    if(node == null){
      return ;
    }

    postOrder(node.left) ;
    postOrder(node.right) ;
    System.out.print(node.data + " ") ;
  }

}

class BTree{
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree() ;

    tree.root = new Node(1) ;
    tree.root.left = new Node(2) ;
    tree.root.right = new Node(3) ;
    tree.root.left.left = new Node(4) ;
    tree.root.left.right = new Node(5) ;
    System.out.println("Inorder traversal of binary tree is ") ;
    tree.inOrder(tree.root) ;
    System.out.println() ;
    System.out.println("Now preOrder traversal") ;
    tree.preOrder(tree.root) ;
    System.out.println();
    System.out.println("Now postOrder traversal") ;
    tree.postOrder(tree.root) ;

  }
}