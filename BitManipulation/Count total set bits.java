// Link :https://www.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        if(n== 0){
            return 0;
        }
     int x = largestPowerOf2(n);
     
     int bits2x = x * (1 << (x -1));
     int msbfrom2 = n - (1 << x) +1;
     int ans = bits2x + msbfrom2 + countSetBits(n - (1 << x));
     
     return ans;
        
    }
    
    public static int largestPowerOf2(int n ){
        int x = 0;
        while((1 << x) <= n){
            x++;
        }
        return x-1;
    }
}

//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		
System.out.println("~");
}
	}
}

// } Driver Code Ends