package LeetCode_JAVA;

import java.util.Stack;

public class LeetCode402
{
    public static void main(String args[])
    {
        //String num  = "1432219"; //1219
        String num = "10200";
        //int k = 3;
        int k =1;
        String res = removeKdigits(num,k);
        System.out.println(res);
    }

    public static String removeKdigits(String num, int k)
    {
        String result = "";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<Integer>();
        if(k==num.length())return new String("0");
        for(int i =0; i< num.length(); i++)
        {
            int temp = Character.getNumericValue(num.charAt(i));

            while   (st.size()>0 && st.peek()>temp && k>0)
            {
                st.pop();k--;
            }
            if(st.size()>0 || temp !=0) {
                st.push(temp);
            }
        }
        while(k>0 && st.size()>0)
        {
            st.pop();
            k--;
        }
        while(st.size()>0)
        {
            sb.append(st.peek());
            st.pop();
        }
        if(sb.isEmpty())
        {
            sb.append("0");
        }
        result = sb.reverse().toString();

        return result;

    }

}