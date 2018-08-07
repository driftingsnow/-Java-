//: /Users/apple/eclipse-workspace/NewProject/src/pa16/Range.java
// Array creation methods that can be used without qualifiers,using Java static imports;

package pa16;

import java.util.Arrays;

public class Range {
//produce a sequence [0..n)


	public static String range(int n) {
		int[] result = new int[n];
		for(int i = 0;i < n; i++)
			result[i] = i;
		return "range(" + n + "): " + Arrays.toString(result);
	}
	
	
	//Produce a sequence [start..end] incrementing by step
	public static int[] range(int start, int end, int step) {
		int sz = (end - start)/step;
		int[] result = new int[sz];
		for(int i = 0; i < sz; i++)
			result[i] = start + (i * step);
		return result;		
	}
 
	
	public static void main(String[] args) {
		//【待续】 range(n),n < 0 要搞个if-else
		System.out.println(range(0));
		System.out.println(range(1));
		System.out.println(range(2));
		System.out.println(range(3));
		
//		System.out.print("range(" + 3 + ")");
//		System.out.println(Arrays.toString(range(3)));
		
		/*下面这个是错的，for语句顺序搞错了
		n = 3
		i = 0  0 < 3 i = 1 result[1] = 1;
		       1 < 3 i = 2 result[2] = 2;
		       2 < 3 i = 3 result[3] = 3;
		       
		*下面这个才是对的
		n = 3
		i = 0  0 < 3 result[0] = 0  i = 1;
		       1 < 3 result[1] = 1  i = 2;
		       2 < 3 result[2] = 2  i = 3;
		*/
		System.out.println();
		System.out.println(Arrays.toString(range(1,5,1)));
		System.out.println(Arrays.toString(range(2,16,2)));
		System.out.println(Arrays.toString(range(2,16,3)));
	
		
	}
		
}
/* 我把输出改良了
 * 原本是直接输出Array，例：[0, 1, 2]
 * 现在是在前面加一个range(n)，例：range(3): [0, 1, 2]
 * 
 * 不会的就google，Arrays.toString什么的本来不知道的；
 * 信心up
 */

///:~
