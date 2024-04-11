package LeetCode_JAVA;

public class LeetCode09
{
    public static void main(String args[])
    {
        int x = 0;
        System.out.println("Input is Palindrome: "+ isPalindrome(x));

    }

    static boolean isPalindrome(int x)
    {
        if(x<0)return false;
        else if(x==0) return true;

        int result =0;
        int num =x;
        while(num>0)
        {
            int rem = num%10;
            num = num/10;
            result = result*10+rem;
        }

        return result==x;
    }
}
