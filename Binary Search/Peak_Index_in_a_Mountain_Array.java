public class Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
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

    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,6,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
