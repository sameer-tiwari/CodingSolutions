import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {
		// Write your code here.
        ArrayList tempArr=new ArrayList<>();
        for(Integer a:arr){
            tempArr.add(a*a);
        } 
        Collections.sort(tempArr);
       return tempArr; 
	}
}