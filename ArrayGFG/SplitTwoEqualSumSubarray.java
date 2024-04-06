package ArrayGFG;

public class SplitTwoEqualSumSubarray
{
    /*Given an array of integers greater than zero,
    find if it is possible to split it in two subarrays,
    such that the sum of the two subarrays is the same.
    Print the two subarrays.
    Input : Arr[] = { 1 , 2 , 3 , 4 , 5 , 5  }
    Output :  { 1 2 3 4 }
          { 5 , 5 }
    */

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,5};
        int size = arr.length;
        printTwoParts(arr, size);
    }

    static int findSplitPoint(int[] arr, int n)
    {
        int leftSum =0;

        for(int i=0; i<n; i++)
        {
            int RightSum=0;
            leftSum += arr[i];

            for(int j=i+1;j<n; j++)
            {
                RightSum += arr[j];
            }
            if(leftSum==RightSum)
            {
                return i+1;
            }
        }

        return -1;
    }
    static void printTwoParts(int[] arr, int n)
    {
        int splitPoint = findSplitPoint(arr,n);

        if(splitPoint==-1|| splitPoint==n)
        {
            System.out.println("Not Possible");
            return;
        }

        for(int i =0; i<n ;i++)
        {
            if(i==splitPoint){
                System.out.println();
            }
            System.out.print(arr[i]+"  ");
        }
    }
}
