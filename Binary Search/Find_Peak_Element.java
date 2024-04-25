public class Find_Peak_Element {
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

    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,6,3,2};
        System.out.println(findPeakElement(arr));
    }
}
