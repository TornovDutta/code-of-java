public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }


        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }

        return new int[]{-1,-1};
    }
    
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
