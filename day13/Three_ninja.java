import java.util.* ;
import java.io.*; 
public class Solution {
  static  ArrayList list;
    static int maxAbility=0;
   static void threeAbility(ArrayList s,ArrayList newstr,int i){
        if(i==s.size()){
            if(newstr.size()==3){
                int prod=1;
                   for(int j=0;j<newstr.size();j++)
                     {  int d= (int)newstr.get(j);
         prod =prod *d;
                     }
                      if(prod>maxAbility)maxAbility=prod;     
                     } 
                        return;
        }
       newstr.add(s.get(i));
       threeAbility(s,newstr,i+1);
       newstr.remove(newstr.size()-1);
       threeAbility(s,newstr,i+1);
    }
    static int firstApr(ArrayList arr){
         Collections.sort(arr);
        int prod=1;
        for(int i=arr.size()-3;i<arr.size();i++){
            
             prod*=(int)arr.get(i);
        }
        return prod;
}
	public static int ninjaCandidate(ArrayList<Integer> arr) {
		list=new ArrayList();
        threeAbility(arr,new ArrayList(),0); 
        int max=maxAbility;
        maxAbility=0;
        return max;   
        //return firstApr(arr);
    
    }
}

