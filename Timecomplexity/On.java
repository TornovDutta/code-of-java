public class On{

    //binary search
    static int binary(int arr[],int l,int n,int val){
        int h=n-1;
        if(h>=l){
            int mid=l+(h-l)/2;
            if(arr[mid]==val){
                return mid;
            }else if(arr[mid]>val){
                return binary(arr,mid+1,n,val);
            }else{
                return binary(arr,l,mid+1,val);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //o(n)
        //linear 
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }


        //logarithmic 
        //O(logn)
        int arr[]={1,2,3,4,5};
        int idx=binary(arr, 0, 5, 4);
        System.out.println(idx);

        //constant
        //O(1)
        System.out.println("hello world");


        //log-linear
        //O(nlogn)
        //sorting


        //quadratic 
        //O(n^2)
        int[] arr2 = {5, 3, 2, 1, 4};

        for (int i = 0; i < arr2.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr2[minIndex];
            arr2[minIndex] = arr2[i];
            arr2[i] = temp;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //Exponental
        //O(2^n)

        //worse
        //O(n!)


    }
}