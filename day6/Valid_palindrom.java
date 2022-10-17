import java.util.* ;
import java.io.*; 

public class Solution {
 
    
    public static boolean isPalin(char[] s,int left ,int right){
        while(left <right){
            if(s[left] !=s[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
     
	public static boolean validPalindrome(int n, String s) { 
        char[] charArr = s.toCharArray();
         int start=0,end=charArr.length-1;
        
         while(start<end){
             if(charArr[start] != charArr[end]){
                 return isPalin(charArr,start+1,end)                     ||isPalin(charArr,start,end-1);
             }
             start++; end--;
         }
         return true;
        
	}

}
