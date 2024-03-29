package LeetCode_JAVA;

import java.util.Scanner;

public class LeetCode242Part2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length())return false;

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {

            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)return false;
        }
        return true;
    }
}
