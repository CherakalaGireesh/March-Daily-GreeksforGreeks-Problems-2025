//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            
            String a = sc.next();
            String b = sc.next();
            Solution ob = new Solution();
            if(ob.isSubSequence(a,b))
            System.out.println(1);
            else
            System.out.println(0);
 		
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isSubSequence(String A, String B) {
        int indx1 = 0;
        int indx2 = 0;
        int m = A.length();
        int n = B.length();
        int cnt= 0;
        
        while(indx1 < m && indx2 < n) {
            if(A.charAt(indx1) == B.charAt(indx2)){
                indx1++;
                indx2++;
                cnt++;
            }
            else{
                indx2++;
            }
        }
        
        return cnt == m;
    }
}