package soring;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //function for quick sort
    //time complexity worst case O(n^2)
    //avg case O(nlogn)
    static void sort(int arr[],int low,int high){

        //base case
        if(low>=high){
            return;
        }


        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];

        while(start<=end){

            //this while loop executed if left side of pivot is smaller then pivot
            while(arr[start]<pivot){
                start++;
            }

            //this while loop executed if right side of pivot is larger then pivot
            while(pivot<arr[end]){
                end--;
            }


            //swap if left side is largest then right side
            if(start<=end){
               swap(arr,start,end);
                start++;
                end--;
            }
        }

        //left side
        sort(arr,low,end);

        //right side
        sort(arr,start,high);
    }



    //swap arr[start] nad arr[end]
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
