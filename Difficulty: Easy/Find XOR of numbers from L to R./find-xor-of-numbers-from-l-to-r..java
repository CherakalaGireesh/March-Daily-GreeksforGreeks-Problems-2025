//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        
        return findXOR(l - 1) ^ findXOR(r);
    }
    
    public static int findXOR(int num) {
        if (num % 4 == 1) return 1;
        else if (num % 4 == 2) return num + 1;
        else if (num % 4 == 3) return 0;
        else return num;
    }
}