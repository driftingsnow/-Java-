//【failure】旋转数组
//这次语句简单多了，可是还是不行，
//太毒了，eclipse上可以的啊，leetcode答案又不一样。
package leetcode;

import java.util.Arrays;

public class MySolution2_1 {
	
	public int[] rotate(int[] nums, int k) {
		
    	int result[] = new int[nums.length];
    	for(int i=0; i<nums.length; i++) {
    		result[(k+i)%nums.length] = nums[i];
    	}
    	return result;
    }

    
    
    public static void main(String[] args) {
		System.out.println("This is my MySolution2.");
		MySolution2_1 obj = new MySolution2_1();
		
		int[] nums = {1,2,3,4,5,6,7};
		System.out.println("original: " + Arrays.toString(nums));
		
		System.out.println(Arrays.toString(obj.rotate(nums,2)));
		System.out.println(Arrays.toString(obj.rotate(nums,3)));
		
		
		
    }


}

//Output:
//This is my MySolution2.
//[5, 6, 7, 1, 2, 3, 4]
//[1, 9, 1, 0, 5, 1, 8, 3, 2]


