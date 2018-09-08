//求交集
package leetcode;
import java.util.HashSet;
import java.util.Set;


public class MySolution5 {
	public Set<Integer> intersect(Set<Integer> nums1, Set<Integer> nums2) {
        //交集
        nums1.retainAll(nums2);
        return nums1;
   }
	
	public static void main(String[] args) {
		System.out.println("This is MySolution5");
		System.out.println("");
		
		MySolution5 obj = new MySolution5();
		Set<Integer> nums1 = new HashSet<>();
		Set<Integer> nums2 = new HashSet<>();

		nums1.add(2);
		nums1.add(3);
		
		nums2.add(3);
		//output should be {3,4}
		System.out.println(obj.intersect(nums1,nums2));
	}

}
