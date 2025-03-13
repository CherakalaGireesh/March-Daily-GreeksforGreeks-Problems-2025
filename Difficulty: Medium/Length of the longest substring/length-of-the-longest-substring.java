//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstring(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        int len = s.length();
        int left = 0, right = 0, maxLen = 0;
        int hash[] = new int[256];
        
        while(right < len){
            if(hash[s.charAt(right)] > 0 && hash[s.charAt(right)] >= left){
                left = hash[s.charAt(right)];
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
            hash[s.charAt(right)] = right + 1;
            right++;
        }
        
        return maxLen;
    }
}