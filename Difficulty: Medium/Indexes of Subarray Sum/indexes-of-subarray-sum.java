//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            ArrayList<Integer> result = ob.subarraySum(nums, d);
            // Print all elements in the result list
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a new line after the result
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int s) {
        int sum = 0;
        int left = 0;
        int right = 0;
        
        while(right<arr.length)
        {
            sum+=arr[right];
            
            while(sum > s)
            {
                sum -= arr[left];
                left++;
            }
               
            if(sum !=0 && sum == s)
            {
                
                return new ArrayList<>(Arrays.asList(left+1,right+1));
            }
         
            right++;
        }
        
        return new ArrayList<>(Arrays.asList(-1));
    }
}
