
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        
        
        	   int targetIndex=-1;
	    int start=0,end=arr.length-1,mid=(start+end)/2;
	    while(start<=end){
	        
	        if(arr[mid]==k){targetIndex=mid;break;}
	        if(k>arr[mid]){start=mid+1;}
	        else{end=mid-1;}
	        mid=(start+end)/2;
	        
	    }
	    return targetIndex;

    }
}