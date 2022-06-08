// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
          HashMap<Integer,Integer> dic= new HashMap<Integer,Integer>();
          dic.put(2,0);
        dic.put(0,0);
        dic.put(1,0);
        
        for(int i = 0; i< n; i++)
        {
            int x= dic.get(a[i])+1;
            dic.put(a[i] , x);   
        }
        int i =0;
        for ( Integer key : dic.keySet() )
        {
            for(int x = 0; x< dic.get(key); x++)
                a[i++]= key;
        }
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends