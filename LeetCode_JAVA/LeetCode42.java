package LeetCode_JAVA;

import java.util.Arrays;

public class LeetCode42
{
    public static void main(String args[])
    {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water: "+ trap(height));

    }

    static int trap(int[] height)
    {
        int n = height.length; //Storing length of Array
        int trappedWater =0; //
        int[] leftMax= new int[n];// Storing Max Building Height to the Left of that idx Building
        int[] rightMax = new int[n];// Storing Max Building Height to the right of that idx Building

       for(int i=0;i<n;i++)// Storing Max Building Height to the right of that idx Building
       {
           int temp = height[i];
           for(int j=i; j<n;j++)
           {
               if(temp<height[j])temp=height[j];
           }
           rightMax[i]=temp;
       }
    System.out.println(Arrays.toString(rightMax));
        for(int i=0;i<n;i++)// Storing Max Building Height to the Left of that idx Building
        {
            int temp = height[i];
            for(int j=i; j>=0;j--)
            {
                if(temp<height[j]) temp = height[j];

            }
            leftMax[i] = temp;
        }
        System.out.println(Arrays.toString(leftMax));

       for(int k =0; k<n; k++)
       {
           int min;
           min = Math.min(leftMax[k],rightMax[k]);
           if(min-height[k]>0){
               trappedWater +=min-height[k];
           }
       }

        return trappedWater;
    }
}
