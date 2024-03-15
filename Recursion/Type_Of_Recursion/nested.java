package Type_Of_Recursion;
public class nested {
    public static int fun(int n){
        if(n>100){
            return n-10;
        }
        //recursion in a recursion
        return fun(fun(n+11));
    }
    public static void main(String[] args) {
        int answer=fun(95);
        System.out.println(answer);
    }
}
