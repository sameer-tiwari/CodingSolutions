import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        // > n/2
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
            map.put(arr[i],map.get(arr[i])+1);
           else{
           map.put(arr[i],1);
                
           } 
            
        } 
        for(int d:map.keySet()){
            
           if(map.get(d) > n/2){
                return d;
           } 
        }
        
        return -1;
        
	}
}