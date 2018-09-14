package leetcode;
//移动零
//? 如果数组里没有零，顺序应当不变，you cuo w

import java.util.Arrays;

public class MySolution7 {
	public void moveZeroes(int[] nums) {
				
		int j = nums.length-1;
		int time=0;
			
		for(int i = 0; i<nums.length-time; i++) {
			if(nums[i]==0) {
				nums[i] = nums[j];
				nums[j] = 0;
				//System.out.println("loop: " + Arrays.toString(nums));
				
				j--;
				time++;
				
			}
		}
		//test
		System.out.println("time= " + time);
		
		//排序
		//if(nums.length>1) {
		Arrays.sort(nums,0,nums.length-time); // find 3
		//}
		
		//输出
		System.out.println("result: " + Arrays.toString(nums));
    }
	public static void main(String[] args) {
		MySolution7 obj = new MySolution7();
		int[] nums = {0,1,0,3,12};
		obj.moveZeroes(nums);
	}

}
