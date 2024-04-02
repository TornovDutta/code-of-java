// Reverse a String (using StringBuilder class)
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        StringBuilder nam=new StringBuilder(name);
        //reverse the string
        for(int i=0;i<nam.length()/2;i++){
            int fornt=i;
            int back=nam.length()-1-i;
            char forntchar=nam.charAt(fornt);
            char backchar=nam.charAt(back);
            nam.setCharAt(fornt,backchar);
            nam.setCharAt(back,forntchar);
        }
        System.out.println(nam);
        sc.close();
    }
}
