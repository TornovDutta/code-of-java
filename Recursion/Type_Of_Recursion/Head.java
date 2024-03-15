package Type_Of_Recursion;
public class Head {
    public static void fun(int n){
        if(n>0){
            //the recursion call is in  start of function
            fun(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        fun(5);
    }
}
