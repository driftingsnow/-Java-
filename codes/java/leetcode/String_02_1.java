//颠倒整数  负数-123修改好了，大数字不行,还是失败
package leetcode;


public class String_02_1 {
	public int reverse(int x)  {
		
		int originalx = x;
		if(x<0) {
			x = -x;
		}
		
		String str = Integer.toString(x);
			//System.out.println("len = " + str.length());
		int len = str.length();
		
		
		String temp1 = Integer.toString(x);
		int[] nums = new int[temp1.length()];
		for (int i = 0; i < temp1.length(); i++){
			nums[i] = temp1.charAt(i) - '0';
			//System.out.println("test nums[" +i+ "]=" + nums[i]);
		}
		//System.out.println();

		
		
		//前面一半都是temp
		int[] temp = new int[len/2];
		for(int i=0; i<len/2; i++) { 
			temp[i] = nums[i];
			//System.out.println("test temp["+i+"]= " + temp[i]);
		}
		//System.out.println();
		
		for(int i=0; i<len/2; i++) {
			nums[i] = nums[len-1-i];
			//System.out.println("test nums["+i+"]: " + nums[i]);
		}
		//System.out.println();
		
		for(int i=0; i<len/2; i++) {
			nums[len-1-i] = temp[i];
			//System.out.println("test1 nums["+(len-1-i)+"]: " + nums[len-1-i]);
		}
		//System.out.println();
		
		//System.out.println("nums: " + Arrays.toString(nums));
		
		
		//如何把int[] 转为 int
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<len; i++) {
			builder.append(nums[i]);
		}
		x = Integer.parseInt(builder.toString());
		//System.out.println("test "+x);
		
		if(originalx<0) {
			return -x;
		}
		
        return x;
    }
	
	public static void main(String[] args) {
		String_02_1 obj = new String_02_1();
		
		int num = 1234567;
		System.out.println("before = " + num);
		System.out.println("after = " + obj.reverse(num));
		System.out.println();
		
		
		int num1 = -1234567;
		System.out.println("before = " + num1);
		System.out.println("after = " + obj.reverse(num1));
		
		
		/*
		int num2 = 9646324351;
		System.out.println("before = " + num2);
		System.out.println("after = " + obj.reverse(num2));
		
		/*
		int num3 = 123;
		System.out.println("before = " + num3);
		System.out.println("after = " + obj.reverse(num3));
		*/
	}

}
