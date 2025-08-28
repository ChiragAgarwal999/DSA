import java.util.*;

public class MaxSubArrKedans{
    public static int kedansAlgo(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr= 0;
        for(int i=0; i<arr.length;i++){
            if((curr+arr[i])<0){
                curr=0;
            }else{
                curr+=arr[i];
            }
            if(curr>max){
                max = curr;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {2,-10,3,4,-2};
        System.out.println(kedansAlgo(arr));
    }
}