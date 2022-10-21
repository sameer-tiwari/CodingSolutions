import java.util.* ;
import java.io.*; 

public class Solution {

  public static int[] parityMove(int a[], int n) {
    // Write your code here.
       int start=0,end=a.length-1;int tempArr[]=new int[a.length];
       for(int data:a){
           if(data%2==0){
               tempArr[start++]=data;
           }
           else{ 
               tempArr[end--]=data;
                } 
       }
      
      return tempArr;
      
  }
}