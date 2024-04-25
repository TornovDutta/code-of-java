public class floor {
    static int binary(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        if(target<arr[0]){
            return -1;
        }


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

        return end;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int ans=binary(arr,15);
        System.out.println(ans);
    }
}
