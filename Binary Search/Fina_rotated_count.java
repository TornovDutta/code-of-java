public class Fina_rotated_count {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(rotatedTime(arr));
    }
    static int rotatedTime(int arr[]){
        return findpivot(arr)+1;
    }
    static int findpivot(int arr[]){
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

            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
