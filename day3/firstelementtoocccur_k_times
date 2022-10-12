
class Solution
{
    public int firstElementKTime(int[] arr, int n, int k) { 
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1); 
            } 
            else {
                map.put(arr[i], 1);
            } 
            if(map.get(arr[i])==k){
                return arr[i];
            } 
        }
        
        return -1;
    } 
}
