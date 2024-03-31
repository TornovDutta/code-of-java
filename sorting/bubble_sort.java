import java.util.Arrays;
class bubble_sort{
    static void swap(int a[],int i,int j){
        a[i]=a[i]^a[j];
        a[j]=a[i]^a[j];
        a[i]=a[i]^a[j];
    }
    //time complexity O(n^2)
    static void sort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
           for (int j = 0; j < a.length-i-1; j++) {
            if(a[j]>a[j+1]){
                swap(a,j,j+1);
            }
           } 
        }
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        sort(arr);


        System.out.println(Arrays.toString(arr));
    }
}