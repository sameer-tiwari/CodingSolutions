
class Solution
{
    public static long numberOfSquares(long base)
    {  
        base = base-2;
    	base = base / 2;
    	
    	return base * (base + 1) / 2;
    
    }
    
}