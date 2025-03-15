//{ Driver Code Starts
// Initial template for JAVA

import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            int k = sc.nextInt();
            Solution ob = new Solution();
            if (ob.areKAnagrams(str1, str2, k) == true)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function template for JAVA

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
      if(s1.length() != s2.length())
        {
            return false;
        }
        
        int result = 0;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        findFrequency(freq1,s1);
        findFrequency(freq2,s2);
        
        for(int i=0;i<26;i++)
        {
            if(freq1[i] != 0 && freq1[i]> freq2[i])
            result += freq1[i]-freq2[i];
        }
        
        return result <= k;
    }
    
    public static void findFrequency(int freq[],String s)
    {
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
    }
}