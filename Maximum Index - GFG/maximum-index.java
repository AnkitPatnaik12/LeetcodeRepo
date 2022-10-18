//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
     int leftmin[]=new int[N];
     int rightmax[]=new int[N];
     leftmin[0]=A[0];
     rightmax[N-1]=A[N-1];
     for(int i=1;i<N;i++)
        {             
            leftmin[i]=Math.min(leftmin[i-1],A[i]);
        }
        for(int i=N-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],A[i]);
        }
        int i=0,j=0,maxv=-1;
        while(i<N&&j<N)
        {
            if(leftmin[i]<=rightmax[j])
            {   maxv=Math.max(maxv,j-i);
                j++;
                
            }
            else
            {
                i++;
            }
        }
        return maxv;
    }
}


