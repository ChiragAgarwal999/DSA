import java.util.*;

public class MaxSubArrSumPrefixSum{
    public static int subArrSumPrefixSum(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr= 0;
        int prefix[]=new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
                    // System.out.println(prefix[i]);
        }
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                if(i>0){
                    max = prefix[j] - prefix[i-1];
                }else{
                    max = prefix[j];
                }
                if(curr < max){
                    curr=max;
                }
            }        
        }
        return curr;
    }
    public static void main(String args[]){
        int arr[] = {2,-10,3,4,-2};
        System.out.println(subArrSumPrefixSum(arr));
    }
}