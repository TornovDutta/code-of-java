package LinkedList;
import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addLast(3);
        System.out.println("size of the linkedlist is :"+list.size());
        System.out.println(list.get(0));
        list.remove(1);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(7);
        System.out.println(list);

    }
}
