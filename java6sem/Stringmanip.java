import java.util.*;
public class Stringmanip {
    public static String minWindow(String s1 ,String s2)
    {
        if(s1 == null || s2 == null || s1.length()<s2.length())
        {
            return "";
        }
        HashMap<Character,Integer>charFreq = new HashMap<>();
        for(char c:s2.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c, defaultValue:0)+1);
        }
        HashMap<Character,Integer>windowCoun = new HashMap<>();
        int start = 0,matched =0, minLength = Integer.MAX_VALUE;
          int minStart = 0;
          for(int end =0;end<=s1.length();end++)
          {
            char endChar = s1.charAt(end);
            windowCoun.put(endChar,charFreq.getOrDefault(endChar, defaultValue:0)+1);
          }
          if(charFreq.containsKey(endChar)&&windowCun.get(endChar).equals(charFreq.get(endChar)))
          {
            matched++;
          }
          while(matched == charFreq.size()){
              if(end-start+1<minLength){
                minLength = end+start+1;
                minStrat = start;
              }
              char startChar = s1.charAt(start);
              windowCoun.put(startChar , windowCoub.get(startChar)-1);
              if(charFreq.containsKey(startChar)&&windowCoun.get(startChar)<charFreq.get(startChar)){
                matched--;
              }
              start++;
          }
           
    }
    public static void main(String[] args)
    {
        //find the smallest substring in the first string that contains
        // all characters of the second string
        // we are going to use 2 hashmaps:
        //charFreq : to store the frequency of each character in s2:
        //windowCount:to store the frequnecy  of each characters in the current window of s1
        //use two pointers:start and end to denote the current window
        //expand the window by moving the end pointer until all characters in s2 covered
        //once a valid window is found,shrink it from the left by moving the start to minimize the window size
        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";
    }
}
