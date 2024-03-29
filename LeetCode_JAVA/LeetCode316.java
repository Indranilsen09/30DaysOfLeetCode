package LeetCode_JAVA;

import java.util.*;

public class LeetCode316
{
    /* Given a string s, remove duplicate letters so that every letter appears once and only once.
    You must make sure your result is the smallest in lexicographical order
    among all possible results.*/

    public static void main(String args[])
    {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            //While We're Using Sets the Result are not in Lexicographical order;
        //    System.out.println(removeDuplicateLettersUsingSets(s));
        //For that Purpose we'll use Array and monotonic stacks
        removeDuplicateLetters(s);
    }

    static String removeDuplicateLettersUsingSets(String s)
    {
        Set<Character> inputs = new HashSet<>();
        for(int i=0; i<s.length();i++)
        {
            inputs.add(s.toLowerCase().charAt(i));
        }
        System.out.println(inputs);
        StringBuilder sb = new StringBuilder();
        for(char k:inputs)
        {
            sb.append(k);
        }
        return sb.toString();
    }

    static String removeDuplicateLetters(String s)
    {
        Stack<Character> st = new Stack<Character>();
        int[] lastoccurence = new int[26];
        boolean[] exists = new boolean[26]; Arrays.fill(exists,false);

        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            lastoccurence[ch-'a'] =i;
        }
        System.out.println(Arrays.toString(lastoccurence));
        for(int i=0; i<s.length();i++)
        {

            char ch = s.charAt(i);
            if(exists[ch-'a']==true)continue;
            while(st.size()>0 && ch<st.peek() && lastoccurence[st.peek()-'a']>i)
            {
                exists[st.peek()-'a']=false;
                st.pop();
            }

            st.push(ch);
            exists[ch-'a']=true;
        }
        System.out.println(st.toString());
        StringBuilder sb = new StringBuilder();

        while(st.size()>0)
        {
            sb.append(st.peek());
            st.pop();
        }

        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();
    }


}
