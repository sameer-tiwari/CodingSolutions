

class GFG
{
    long maxSum(long arr[] ,int n)
    {
     Arrays.sort(arr);
     long newArr[]=new long[arr.length];
     int i=0,j=arr.length-1,k=0;
     //arranging in format
     while(i<=j){
         if(i==j){newArr[k]=arr[i];break;}
         
         newArr[k++]=arr[i++];
         newArr[k++]=arr[j--];
         
     }
       long maxSum=0;
      for(int p=1;p<newArr.length;p++){
         if(p==newArr.length-1){ maxSum+=Math.abs(newArr[p]-newArr[0]); }
          maxSum+=Math.abs(newArr[p]-newArr[p-1]);
       }
      return maxSum;
        
    }
}
