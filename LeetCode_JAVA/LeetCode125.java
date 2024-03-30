package LeetCode_JAVA;

public class LeetCode125
{
    public static void main(String args[])
    {
        String s = "A man, a plan, a canal: Panama";
        //String s = "racecar";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(char ch :s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String in = sb.toString();
        int i = 0;
        int j = in.length()-1;

        while(i<j)
        {
            if(i==j)continue;
            if(in.charAt(i)!= in.charAt(j))
            {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
