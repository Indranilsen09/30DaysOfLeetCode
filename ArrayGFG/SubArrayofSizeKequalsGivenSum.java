package ArrayGFG;

public class SubArrayofSizeKequalsGivenSum
{
    public static void main(String args[])
    {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 3;int sum = 6;
        if(subarrayequalsSum(arr,k,sum)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static boolean subarrayequalsSum(int[] arr, int k, int sum)
    {

        for(int i=0; i<(arr.length-k)+1; i++)
        {
            int add =0;
            for(int j =i; j<i+k; j++)
            {
                add += arr[j];
            }
            if(add==sum){
                System.out.println("Result Sum ="+ add + " Expecte Sum ="+ sum);
                return true;
            }
            else  System.out.println("Result Sum ="+ add + " Expecte Sum ="+ sum);
        }
        return false;
    }
}
