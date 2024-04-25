public class orderAgnosticBS {
    public static int orderAgnosticBS(int arr[], int target) {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                   end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]>target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int target=1;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
}
