package leetcode;

import java.util.Arrays;

//[pass]移动零
//看了一下别人的代码


public class MySolution7_1 {
	public void moveZeroes(int[] nums) {
		int zerocount=0;
		int len = nums.length;
		for(int i=0; i< nums.length; i++) {
			if(nums[i]==0) {
				zerocount++;
			}
			else {
				nums[i-zerocount] = nums[i];
			}
		}
		//System.out.println("test: " + Arrays.toString(nums)); //Output: test: [1, 3, 12, 3, 12]
		for(int j=0; j<zerocount; j++) {
			nums[len-1-j] = 0;
		}
		System.out.println(Arrays.toString(nums));

		
		
		
    }
	
	public static void main(String[] args) {
		System.out.println("MySolution7_copy1");
		MySolution7_1 obj = new MySolution7_1();
		
		
		int[] nums = {0,1,0,3,12};
		obj.moveZeroes(nums);
		
		int[] nums1 = {2,1,3};
		obj.moveZeroes(nums1);
	}

}
