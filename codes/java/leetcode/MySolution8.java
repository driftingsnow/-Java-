package leetcode;
//两数之和
//eclipse Pass,leetcode Failure（好像是Arraylist的问题）

import java.util.ArrayList;

public class MySolution8 {
	public ArrayList<Integer> twoSum(int[] nums, int target) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int j=0; j<nums.length-1; j++) {
			for(int i=j+1; i<nums.length; i++) {
				if(nums[j]+nums[i] == target) {
						System.out.println("test j=" + j);	
						System.out.println("test i=" + i);
					result.add(j);	
					result.add(i);
						System.out.println("test loop: " + result);
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		MySolution8 obj = new MySolution8();
		int[] nums = {0,3,1,2,4,7};
		int target = 10;
		System.out.println(obj.twoSum(nums, target));
	}
}
