
class Solution {
    int remove_duplicate(int A[],int N){
          // code here
        
     int i=0,j=1;
     
        while(j<N){
            if(A[i]==A[j]){j++;continue;}
              
                i++;
                A[i]=A[j];
             
        }
        
        return i+1;
        
            
    }
}