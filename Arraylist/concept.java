package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class concept{
    public static void main(String[] args) {
        // Syntax of an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Operations on ArrayList

        // Add elements to ArrayList
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Get element at index 3 in ArrayList
        System.out.println(list.get(3));

        // Set element at index 0 to 5
        list.set(0, 5);
        System.out.println(list);

        // Delete element at index 3
        list.remove(3);
        System.out.println(list);

        // Size of ArrayList
        System.out.println(list.size());

        // Iterate over ArrayList using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        // Sorting ArrayList
        Collections.sort(list);
        System.out.println(list);
    }
}


