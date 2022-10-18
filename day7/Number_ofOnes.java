import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countOnBits(int num) {
		// Write your code here.
        int count1Bits=0;
        while(num>0){
            if((num&1)==1){count1Bits++; }
            num=num>>1;
        }
        return count1Bits;
	}
}