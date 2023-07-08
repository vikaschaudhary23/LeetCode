//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        if(n<3) return false;
        
        // int i=0,j=1;
        // while(i<n-1 && j<n){
        //     int k=j+1;
        //     while(k<n){
        //         if(arr[i]+arr[j]+arr[k] == 0) return true;
        //         k++;
        //     }
        //     j++;
        //     if(j==n-1){
        //         i++;
        //         j=i+1;
        //     }
        // }
        Arrays.sort(arr);
        int i=0;
        while(i<n-1){
            int left=i+1,right=n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==0) return true;
                else if(sum<0) left++;
                else right--;
            }
            i++;
        }
        
        return false;
    }
}