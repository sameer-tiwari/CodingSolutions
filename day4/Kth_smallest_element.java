
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int max=arr[0];
	   for(int a:arr){if(a>max)max=a;}
	    boolean check[]=new boolean[max+1];
	    // 1 4 7 10  15 20
	    for(int a:arr){check[a]=true;}
	    int i=0,count=0,index=0;
	    while(count<k && i<check.length){
	        if(check[i]){ index=i;count++; }
	        i++; 	         
	    }
	    return index; 
	
        
    } 
}
