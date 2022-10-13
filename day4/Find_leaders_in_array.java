
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        // ArrayList<Integer> leaders=new ArrayList<>();
        // boolean isLeader;
        
        // for(int i=0;i<arr.length-1;i++){
        //  isLeader=true;
        // for(int j=i+1;j<arr.length;j++){
        //     if(arr[j]>arr[i]){
        //         isLeader=false;break;
        //     }
            
        // }    
        //  if(isLeader){leaders.add(arr[i]);}
            
        // }
        // // last element is always going to be the leader bcs no element to its right
        // leaders.add(arr[arr.length-1]);
        // return leaders;
        //optimized
        ArrayList<Integer> leaders=new ArrayList<>();
           int largestElementTillNow=Integer.MIN_VALUE;
           
        for(int j=arr.length-1;j>=0;j--){
            
            if(arr[j]>=largestElementTillNow){
                 largestElementTillNow=arr[j];
                 leaders.add(arr[j]);
                 
            }
            
         }
         Collections.reverse(leaders);
            return leaders;
}
}
