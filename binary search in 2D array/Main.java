import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(arr,37)));
    }
    static int[] search(int [][] matrix,int target){
        int row=0;
        int coloum=matrix.length-1;
        while(row<matrix.length && coloum>=0){
            if(matrix[row][coloum]==target){
                return new int[]{row,coloum};
            }else if(matrix[row][coloum]<target){
                row++;
            }else{
                coloum--;
            }
        }


        return  new int[]{-1,-1};
    }
}
