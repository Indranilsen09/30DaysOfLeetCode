package ArrayGFG;

public class SubArrayisEqualtoProduct
{
    public static void main(String args[])
    {
        int[] arr = {3,-1,-1,-1,5};
        int n = arr.length;
        int k = -15;
        if(maxProduct(arr,n,k))
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static boolean maxProduct(int[] arr,int n, int p)
    {
        int maxVal = arr[0];
        int minVal = arr[0];
        int maxProduct = arr[0];

        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                int temp = maxVal;
                maxVal= minVal;
                minVal= temp;
            }

            maxVal= Math.max(arr[i],maxVal*arr[i]);
            minVal= Math.min(arr[i],minVal*arr[i]);

            if(maxVal==p||minVal==p)
            {
                return true;
            }
        }
        return false;
    }
}
