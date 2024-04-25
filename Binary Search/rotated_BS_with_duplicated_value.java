public class rotated_BS_with_duplicated_value {
    public static void main(String[] args) {
        int arr[]={4,4,4,5,6,7,0,1,2};
        System.out.println(findpivotwithduplicated(arr));
    }
    static int search(int[] nums, int target) {
        int pivot=findpivotwithduplicated(nums);
        if(pivot==-1){
            return binary(nums, target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binary(nums,target,0,pivot-1);
        }
        return binary(nums,target,pivot+1,nums.length-1);

    }
    static int binary(int arr[],int target,int start,int end){

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
    static int findpivotwithduplicated(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[start]==arr[mid] && arr[mid]==arr[start]){
                //if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start]<arr[mid] && arr[start]==arr[mid] || arr[mid]>arr[end]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
