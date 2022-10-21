public class Solution {
static void merge(int arr[],int s,int mid,int e){
    int A[]=new int[mid-s+1];
    int B[]=new int[e-mid];
    int tempArr[]=new int[e-s+1];
    int k=0;
    for(int i=s;i<=mid;i++){A[k++]=arr[i];}k=0;
    for(int i=mid+1;i<=e;i++){B[k++]=arr[i];}
    int i=0,j=0;k=0;
    while(i<A.length && j<B.length){
        if(A[i]<B[j]){tempArr[k++]=A[i];i++; }
        else{tempArr[k++]=B[j];j++;}
    }
    while(i<A.length){tempArr[k++]=A[i];i++;}
    while(j<B.length){tempArr[k++]=B[j];j++;}
     k=0;
    while(k<tempArr.length){arr[s+k]=tempArr[k]; k++;}
}
 static void  mergesort(int arr[],int s,int e){
     if(s<e){
     int mid=(s+e)/2;
     mergesort(arr,s,mid);
     mergesort(arr,mid+1,e);
     
     merge(arr,s,mid,e);
     }
 }	
    public static void mergeSort(int[] arr, int n) {
		// Write your code here.
         mergesort(arr,0,arr.length-1);
    }
}