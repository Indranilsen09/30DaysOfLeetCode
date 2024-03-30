package LeetCode_JAVA;

import java.util.Hashtable;

public class LeetCode13
{
    public static void main(String args[])
    {
       // String s= "III";
       // String s = "LVIII";
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s)
    {
        int value=0;
        int result=0;
        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("I",1); ht.put("V",5);ht.put("X",10);ht.put("L",50);ht.put("C",100);
        ht.put("D",500);ht.put("M",1000);ht.put("IV",4); ht.put("IX",9); ht.put("XC",90);
        ht.put("XL",40);ht.put("CD",400); ht.put("CM",900);


        for(int i=0; i< s.length();i++)
        {
            if(s.charAt(i)=='C' && i+1<s.length()&&  s.charAt(i+1)=='M')
            {
                value = ht.get("CM");
                i++;

            } else if(s.charAt(i)=='X' &&i+1<s.length() && s.charAt(i+1)=='C'){
                value = ht.get("XC");
                i++;

            }
             else if(s.charAt(i)=='I' && i+1<s.length()&&  s.charAt(i+1)=='V')
            {
                 value = ht.get("IV");
                 i++;

            }
            else {
               value  = ht.get(String.valueOf(s.charAt(i)));
            }

            result = result +value;

        }
        return result;

    }
}
