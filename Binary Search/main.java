public class main {
    public static void main(String[] args) {
        int arr[]={1,5,9,56,89};
        System.out.println(binary(arr,56));
    }
    static int binary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return -1;
    }

}
