package Type_Of_Recursion;
public class tree {
    public static void fun(int n){
        if(n>0){
            System.out.println(n);
            //multiple recursion call
            fun(n-1);
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        fun(5);
    }
}
