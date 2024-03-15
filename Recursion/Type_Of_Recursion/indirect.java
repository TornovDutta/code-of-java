package Type_Of_Recursion;
public class indirect {
    //the function call funB
    public static void funA(int n){
        if(n>0){
            System.out.println(n);
            funB(n-1);
        }
    }

    //the function call funA
    public static void funB(int n){
        if(n>0){
            System.out.println(n);
            funA(n/2);
        }
    }

//so a loop is creating
    public static void main(String[] args) {
        funA(5);
    }
}
