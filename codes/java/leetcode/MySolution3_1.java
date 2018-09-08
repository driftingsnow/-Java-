//存在重复(给定一个整数数组，判断是否存在重复元素)。
//用Arrays.sort(nums)给数组排序，然后只要比较相邻的元素是否相等就可以了，只需要一个for循环
package leetcode;

import java.util.Arrays;

public class MySolution3_1 {
	public boolean containsDuplicate(int[] nums) {
    	boolean result;
        result = false;
        Arrays.sort(nums);
    	for(int i=0; i < nums.length-1; i++) {
    		if(nums[i] == nums[i+1]) {
    			result = true;
    		}
    	}
		return result;
    }  
	    
	    
	    
	    
	    
	    public static void main(String[] args) {
			System.out.println("This is my MySolution3.");
			MySolution3_1 obj = new MySolution3_1();
			int[] nums0 = {1,2,2222,1,12,2,2,1};//true
			int[] nums1 = {1,9,2,4,0,100,33,77,99};//false
			int[] nums2 = {1,1,1,1};//true
			int[] nums3 = {1,1,1,3};//true
			int[] nums4 = {9,7,4,5,2,1,3,0};//false
			
			System.out.println(obj.containsDuplicate(nums0));
			System.out.println(obj.containsDuplicate(nums1));
			System.out.println(obj.containsDuplicate(nums2));
			System.out.println(obj.containsDuplicate(nums3));
			System.out.println(obj.containsDuplicate(nums4));
			
			
	    }

}

/*Output

This is my MySolution3.
true
false
true
true
false

 */
