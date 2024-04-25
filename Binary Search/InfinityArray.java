class InfinityArray {

    static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int temp=end+1;
            end=end+(end-start+1);
            start=temp;
        }
        return binary(arr,target,start,end);
    }

    static int binary(int arr[],int target, int start, int end){

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
