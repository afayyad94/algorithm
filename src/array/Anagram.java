package array;

/*
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An array.Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
  
  */
public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int s_Sum =0;
        int t_Sum =0;
        for(int i =0; i <  s.length(); i++) {
            s_Sum = s_Sum + s.charAt(i);
            t_Sum = t_Sum + t.charAt(i);
        }



        return s_Sum == t_Sum;
    }
    public static void main(String args[]) {
        System.out.println("The result is : " + isAnagram("anagram","nagaram"));

    }

}