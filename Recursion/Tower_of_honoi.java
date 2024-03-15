import java.util.Scanner;;
public class Tower_of_honoi {
    public static void TOH(char a,char b,char c,int n){
        if(n>0){
            TOH(a, c, b, n-1);
            System.out.println("From "+a+" to "+c);
            TOH(b, a, c, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char a='A',b='B',c='C';
        System.out.println("Enter the number of disk:");
        int num=sc.nextInt();

        TOH(a, b, c, num);
        sc.close();
    }
}
