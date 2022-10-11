public class Main
{
	public static void main(String[] args) {
	    String s="abbbacccadd";
	   String temp=""+s.charAt(0);
	   char curr=s.charAt(0);
	    
	    for(int i=0;i<s.length();i++){
	        
	        if(curr!=s.charAt(i)){
	            temp+=""+s.charAt(i); 
	            curr=s.charAt(i);
	        } 
 	    }
	    
		System.out.println(temp);
	}
}

