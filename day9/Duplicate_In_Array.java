import java.util.ArrayList;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
int totalSum=0,sum=0;
int N=arr.size();
        for(int a:arr){
        totalSum+=a; 
    }
        for(int i=1;i<N;i++){
            sum+=i;
        }
    return totalSum-sum;
    }
}