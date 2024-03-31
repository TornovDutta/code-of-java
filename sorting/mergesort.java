package soring;
import java.util.Arrays;

public class mergesort{
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    //time complexity O(nlogn)
    static int[] sort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=sort(Arrays.copyOfRange(arr,0,mid));
        int right[]=sort(Arrays.copyOfRange(arr,mid,arr.length));


        return merge(left,right);
    }
    static int[] merge(int first[],int second[]){
        int mix[]=new int[first.length+second.length];
        int i,j,k;
        i=k=j=0;
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i++];
            }else{
                mix[k]=second[j++];
            }
            k++;
        }

        //reminding part
        while(i< first.length){
            mix[k++]=first[i++];
        }

        while(j< second.length){
            mix[k++]=second[j++];
        }

        return mix;
    }
}