// public class power {
//     public static int pow(int m,int n){
//         if(n==0){
//             return 1;
//         }
//         return pow(m,n-1)*m;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(pow(2,3));
//     }
// }


public class power{
    public static int pow(int m,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow(m*m,n/2);
        }
        return m*pow(m*m,(n-1)/2);
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
}