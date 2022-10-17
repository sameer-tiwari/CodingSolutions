import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int missing=-1,repeatNum=-1,sum=n*(n+1)/2;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.size();i++){    
            if(!set.contains(arr.get(i))){set.add(arr.get(i));}
            else{ repeatNum=arr.get(i);}
        } 
        
        for(Integer d:set){
            sum=sum-d; 
        }
        missing=sum;
     //   System.out.println(missing+" "+repeatNum);
        return new int[]{missing,repeatNum};
    }
}