//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        int result[] = new int[2];
        int i = 0, index = 0;
        Arrays.sort(Arr);
        
        while (i < N - 1) {
            if(Arr[i] != Arr[i + 1]) {
                result[index++] = Arr[i];
                i++;
                continue;
            }
            
            i += 2;
        }
        
        if(i < N) result[1] = Arr[i];
        
        result[0] = result[0] ^ result[1];
        result[1] = result[0] ^ result[1];
        result[0] = result[0] ^ result[1];
        
        return result;
    }
}