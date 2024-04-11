package LinkedList;

public class LL {
    private node head;
    private node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insterfirst(int val){
        node Node=new node(val);
        Node.next=head;
        head=Node;

        if(tail==null){
            tail=head;
        }

        size++;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.print("end");
    }

    private class node{
        private int val;
        private node next;

        public node(int val) {
            this.val = val;
        }

        public node(int val, node next) {
            this.val = val;
            this.next = next;
        }


    }
}
