package LinkedList;

public class LL {
    LL(){
        this.size=0;
    }

    private Node head;
    private Node tail;
    private int size;

    //add node in first of the list
    public void addFirst(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    //add node at last of the list
    public void addLast(int val){
        if(head==null){
            System.out.println("The list is empty");
        }
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        Node tempnode=head;
        while(tempnode.next!=null){
            tempnode=tempnode.next;
        }
        tempnode.next=newnode;

    }

    //delete  head
    public void delecthead(){
        if(head==null){
            System.out.println("The list is Empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete tail
    public void deletetail(){
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;

    }

    //display size
    public int size(){
        return size;
    }
    //display list
    public void display(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        Node tempnode=head;
        while(tempnode!=null){
            System.out.print(tempnode.data+" -->");
            tempnode=tempnode.next;
        }
        System.out.println("End");
    }
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
            size++;
        }
    }

}
