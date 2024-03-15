package Type_Of_Recursion;
public class tail{
    public static void fun(int n){
        if(n>0){
            System.out.println(n);
            //here the recursion call came at end of function
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        fun(5);
    }
}