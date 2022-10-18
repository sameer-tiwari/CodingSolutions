import java.util.* ;
import java.io.*; 
public class Solution {
    public static int isCyclicRotation(String p, String q)  {
        int n=p.length()-1; 
        if(p.equals(q))return 1; 
        for(int i=n;i>=0;i--){
            list.add(p);
           p=p.charAt(n)+p.substring(0,n);
            
           if(p.equals(q))return 1; 
       }
     return 0;   
    }
}