import java.util.* ;
import java.io.*; 
public class Solution {
    static String swap(String s,int a,int b){
        char arr[]=s.toCharArray();
         char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return String.valueOf(arr);
    }
  static boolean isVowel(char c){
  return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
  }   
    public static String reverseVowels(String s){
        // Write your code here.
        //lowercase
        int start=0,end=s.length()-1;
        while(start<end){
            char charAtStart=s.charAt(start);
            char charAtEnd=s.charAt(end);
     if(isVowel(charAtStart) && isVowel(charAtEnd)){ s=swap(s,start,end); start++;end--;continue;   }
  
  if(!isVowel(charAtEnd)){end--;continue;}
  if(!isVowel(charAtStart))start++;
            
        }
         
        return s;
    }
}
