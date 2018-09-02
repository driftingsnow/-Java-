/*
 * 另一种方法：import org.apache.commons.lang3.ArrayUtils。感觉这个方法比较好
 * 目的：消除相同的数字，得出新数组的长度
 * 自己的solution，没用什么快慢指针，不会快慢指针
 */

package leetcode;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class MySolution0_1 {
	public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int j = 1; //新数组的长度
        int[] newnums;
        int newsize = 0;
        int i=0;
        newnums = null; //初始化newnums
        newnums = ArrayUtils.add(newnums, 0); //把数组nums第一个元素添加到新数组newnums中.即新数组newnums = {nums[0]},只有一个元素在新数组内
        System.out.println("newnums: " + Arrays.toString(newnums));
        
        for(i=0;i<nums.length - 1;i++){  //注意nums.length要-1,否则会出错，例如{1,1,2} i只用到1，应该是i<2
            if(nums[i] != nums[i+1]){  //如果相邻元素不相等
            	newnums = ArrayUtils.add(newnums, nums[i+1]); //则在新数组newnums中添加新元素nums[i+1]，即后面那个元素
            	newsize = newnums.length;
            	System.out.println(Arrays.toString(newnums));
            	
            }
        }
        return newsize;//新数组的长度
        
    }

	
	public static void main(String[] args) {
		System.out.println("This is my MySolution0_1.");
		MySolution0_1 obj = new MySolution0_1();
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4,3}; //size=11
		/*
		 * i=0 newnums=0,1,1,1,2,2,3,3,4,3  size=10
		 * i=1 {0,0,1,1,1,2,2,3,3,4,3};
		 * i=2 newnums=0,0,1,1,2,2,3,3,4,3
		 * 
		 * i=0   0,1,1,1,2,2,3,3,4,3
		 * i=1   0,1,1,2,2,3,3,4,3
		 * i=2   
		 * i=3   0,1,1,2,3,3,4,3
		 * i=4   0,1,1,2,3,4,3
		 * i=5
		 * i=6
		 * 
		 */
		System.out.println();
		System.out.println(obj.removeDuplicates(nums));

//		int[] nums1 = {1,1,2};
//		System.out.println(obj.removeDuplicates(nums1));
		
//		int[] nums2 = {1,1,2,1};
//		System.out.println(obj.removeDuplicates(nums2));
		
		int[] nums3 = {1,1,2,1,7,7,7,7,7,12,12,12,0,0,3,4,3,4,3,4,3,3,3}; //13
		System.out.println(obj.removeDuplicates(nums3));
		
		
		
	}
	
}


	