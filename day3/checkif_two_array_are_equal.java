
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {   
        Arrays.sort(B);
        Arrays.sort(A);
        
	for(int i=0;i<N;i++){ if(A[i] != B[i]){
		 return false;
		}
	}
	  return true;
    }
}