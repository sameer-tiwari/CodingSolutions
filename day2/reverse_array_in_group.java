import java.util.*;
public class Main
{
static void reverseInGroups(ArrayList<Integer> arr,  int k) {
         for(int i=0;i<arr.size();i+=k){
             int s=i;
             int e= (i+k-1)<arr.size()?(i+k-1):arr.size()-1 ;
             
            while(s<=e){
                 System.out.print(arr.get(e)+" "); 
                e--;
            }
                 
        }
}
	public static void main(String[] args) {
    ArrayList list=new ArrayList();
    list.add(2);list.add(8);list.add(3);list.add(4);
    reverseInGroups(list,2);
  
 	}
}
