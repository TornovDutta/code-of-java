public class Taylo {
    public static int NeR(int n,int r){
        if(n==r||r==0){
            return 1;
        }
        return NeR(n-1,r-1)+NeR(n-1, r);
    }
    public static void main(String[] args) {
        System.out.println(NeR(4, 2));
    }
}
