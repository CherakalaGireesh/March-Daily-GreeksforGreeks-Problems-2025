//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int maxLen = -1;
        int len = s.length();
        
        for(int i = 0; i < len; i++){
            Set<Character> set = new HashSet<>();
            
            for(int j = i; j < len; j++){
                set.add(s.charAt(j));
                if(set.size() > k){
                    break;
                }
                else if(set.size() == k)
                {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        
        return maxLen;
    }
}