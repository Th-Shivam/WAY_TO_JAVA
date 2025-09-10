class Node {
    public int data ;
    public Node next ;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class LL {
    Node head ;

    LL(){
        this.head=null;
    }

    void pushFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }else{
            newNode.next = head ;
            head = newNode ;
        }
    }

    void pushBack(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }else{
            Node temp = head ;
            while(temp.next!=null){
                temp = temp.next ;
            }
            temp.next = newNode ;
        }
    }

    void pushPos(int data , int pos ){

        
        if(pos == 0 ){
            pushFront(data);
            return ;
        }else{
            Node newNode = new Node(data);
            Node temp = head ;
            for(int i = 0 ; i<pos-1 ; i++){
                temp = temp.next ;
            }
            newNode.next = temp.next ;
            temp.next = newNode ;


        }
    }

    void PrintLL(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        LL list = new LL() ;
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushPos(99,2);
        list.pushPos(95,1);
        list.pushFront(0);
        list.PrintLL();
    }
}
