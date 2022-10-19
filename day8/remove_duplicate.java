
class Solution {
    int remove_duplicate(int A[],int N){
          // code here
          //2233456 
     // 2345
     int[] tempArr=new int[N];
        int k=0,count=0;
         
        for(int i=0;i<tempArr.length;i++){
          tempArr[i]= -1;
        } 
        for(int i=0;i<A.length-1;i++){
            
          if(A[i]==A[i+1]){continue;}
          else{ 
    
          tempArr[k]=A[i];
          tempArr[k]=A[i+1];
    
          }
        }
        
        for(int a:tempArr){
           if(a != -1)count++;
        } 
        return count;
        
            
    }
}