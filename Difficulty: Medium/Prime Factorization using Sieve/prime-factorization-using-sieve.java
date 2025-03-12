//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            obj.sieve();
            List<Integer> ans = obj.findPrimeFactors(n);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // You must implement this function
    static void sieve() {}

    static List<Integer> findPrimeFactors(int N) {
        List<Integer> results = new ArrayList<>();
        
        for(int i = 2; i * i <= N; i++){
            if(N % i == 0){
                while(N % i == 0){
                    results.add(i);
                    N = N / i;
                }
            }
        }
        if(N != 1) results.add(N);
        return results;
    }
}
