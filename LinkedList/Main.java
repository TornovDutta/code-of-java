package LinkedList;

public class Main {
    public static void main(String[] args) {
       LL list=new LL();

        list.addLast(5);
        list.addLast(6);
        list.deletetail();


        list.display();
        System.out.println("the size of list is : "+list.size());

    }
}
