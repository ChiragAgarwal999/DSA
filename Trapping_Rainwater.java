import java.util.*;
public class Trapping_Rainwater{
    public static int trappedRainwater(int height[]){
      int n = height.length;
      int width =1;
       // calculate left max boundry - array
       int leftMax[] = new int[n];
       leftMax[0] = height [0];
       for (int i=1; i<n; i++){
        leftMax[i] = Math.max(height[i],leftMax[i-1]);
        // System.out.print(leftMax[i]+" ");
       }

       // calculate right max boundry - array
       int rightMax[] = new int[n];
       rightMax[n-1] = height [n-1];
       for (int i=n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i],rightMax[i+1]);
        // System.out.print(rightMax[i]+" ");
       }
        
        int trappedWater = 0;
       //loop
       for (int i=0 ; i<n; i++){
        //waterlevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

         //trapped water = waterLevel - height [i]   
            trappedWater += ((waterLevel - height[i])*width);
       }
       return trappedWater;
}

    public static void main(String  args[]){
    int height[]={4, 2, 0, 6, 3, 2, 5};
    System.out.print(trappedRainwater(height));
}
}