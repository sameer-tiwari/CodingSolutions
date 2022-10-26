

public class Solution {

    public static ArrayList<Pair> duplicate_char(String s, int n) { 
        ArrayList<Pair> list=new ArrayList<>();
        boolean isUpper=false;
        
     // checking whether a string is upperCase or lowercase
        if(s.charAt(0)>='A' && s.charAt(0)<='Z')isUpper=true;
//array that will store count i.e for a store count on 0 th index
        int charFreq[]=new int[256];
  //storing count of each chracter in charFreq array
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isUpper)charFreq[c-'A']++;
            else{charFreq[c-'a']++;}
        }
// checking the duplicate element using its count in charFreq array and storing in list accordingly
        for(int i=0;i<charFreq.length;i++){
            int count=charFreq[i];   
            if(count>1){
                char c;
      if(isUpper){ c=(char)(i+'A');}
            else{c=(char)(i+'a');}
                
                 list.add(new Pair(c,count));
            }   
        } 
return list;        
        
    }
}