import java.util.Arrays;;
public class Insertion{
    //time complexity O(n^2)
    static void sort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int cuurent=a[i];
            int j=i-1;
            while(j>=0 && cuurent<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=cuurent;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}