package leetcode;
import java.util.Arrays;

class MySolution4 {
	public int singleNumber(int[] nums) {
        int T=0;
        for(int i:nums){
            T ^= i;
        }
        return T;
        
    }
		
		
		
	

    
    public static void main(String[] args) {
    	MySolution4 obj = new MySolution4();
    	
   	
    	int[] nums1 = {2,8,8,3,7,1,2,1,7,3,9};
    	System.out.println(Arrays.toString(nums1));
    	System.out.println("");
    	
   // 	System.out.println(obj.singleNumber(nums1));
    	System.out.println(obj.singleNumber(nums1));
   	
    	
    	
    }
}