//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s1 = sc.next();
            String s2 = sc.next();
            Solution obj = new Solution();
            String ans = obj.minWindow(s1, s2);
            if (ans.length() == 0) {
                System.out.println("\"\"");
            } else {
                System.out.println(ans);
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String minWindow(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m < n) return "";

        int minLen = Integer.MAX_VALUE;
        String result = "";

        for (int i = 0; i < m; i++) {
            int j = 0, end = i;

            while (end < m) {
                if (s1.charAt(end) == s2.charAt(j)) {
                    j++;
                }
                if (j == n) break;
                end++;
            }

            if (j < n) break;

            int left = end, k = n - 1;
            while (left >= i) {
                if (s1.charAt(left) == s2.charAt(k)) {
                    k--;
                }
                if (k < 0) break;
                left--;
            }

            if (end - left < minLen) {
                minLen = end - left;
                result = s1.substring(left, end + 1);
            }
        }
        return result;
    } 
}
