public class Find_in_Mountain_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(arr,3));
    }
    public static int findInMountainArray(int arr[],int target){
        int peak=findPeakElement(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    public static int orderAgnosticBS(int arr[], int target,int start,int end) {

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
    public static int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //increase order
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            //decrease order
            else{
                start=mid+1;
            }
        }

        return start;
    }
}
