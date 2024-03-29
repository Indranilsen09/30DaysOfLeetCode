package LeetCode_JAVA;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class LeetCode242
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        System.out.println(isAnagram(s,t));
    }

    static Boolean isAnagram(String s, String t)
    {
        if(s.length()==t.length()) {
            Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
            for (int i = 0; i < s.length(); i++) {
                ht.put(s.charAt(i), i);
            }
            System.out.println(ht);
            for (int i = 0; i < t.length(); i++)
            {
                char ch = t.charAt(i);
                if(ht.containsKey(ch))continue;
                else return false;

            }
            return true;
        }else{
            return false;
        }
    }
}
