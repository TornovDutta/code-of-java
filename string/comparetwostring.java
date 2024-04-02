//here name01>name02 then return positive value
//name==nmae02 then return zero
//name01<name02 then return negative value
//eg: hello(greater than)
//hallo (less than)
//becuse in charat(1) e is greater than a
//a->1
//b->2
//c->3
// d->4
// e->5
import java.util.*;
public class comparetwostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name01=sc.nextLine();
        String name02=sc.nextLine();
        System.out.println(name01.compareTo(name02));
        //hello
        // hallo
        // ans:4
        // a->1
        // e->5
        // so,(e-a)=4
        sc.close();

    }
}
