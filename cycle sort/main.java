import java.util.Arrays;

class main {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    private static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
