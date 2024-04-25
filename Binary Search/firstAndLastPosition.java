public class firstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);


        return ans;
    }
    int search(int nums[],int target,boolean findstartidx){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                if(findstartidx){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
