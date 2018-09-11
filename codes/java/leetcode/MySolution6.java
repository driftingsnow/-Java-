package leetcode;
//eclipse上可以，leetcode上通不过，不知道是不是因为用了import java.util.Arrays;

import java.util.Arrays;

//加一（给数组的最高位数字加一）
public class MySolution6 {
	public int[] plusOne(int[] digits) {
		int len = digits.length;
		int[] newarray = new int[len];
		
        for(int i = 0; i < len; i++){//复制digits的元素到newarray里去
        	newarray[i] = digits[i];
        }
        //System.out.println("The original newarray: " + Arrays.toString(newarray));
        
		int i = newarray.length-1;//整数最低位
        //digits = {0}
		
		//
		if(digits[i]>=0 && digits[i]<9) {
    		newarray[i] = digits[i]+1;
    		//System.out.println("here newarray: " + Arrays.toString(newarray));
    	}
		
		if(digits.length == 1 && digits[i]==9) {
			newarray = Arrays.copyOf(newarray , len+1);
			newarray[0] = 1;
			newarray[1] = 0;
			System.out.println("here 0 newarray: " + Arrays.toString(newarray));
		}
		
		if(digits[i]==9 && digits.length >1) {//9,9,9
			newarray[i]=digits[i]+1;//
			System.out.println("here 0 newarray: " + Arrays.toString(newarray));
			for(i=digits.length-1;newarray[i]>9;i--) {
				newarray[i]=0;
				System.out.println("here 0 newarray: " + Arrays.toString(newarray));
				newarray[i-1] = digits[i-1]+1;
				if(newarray[0]>9) {
					newarray = Arrays.copyOf(newarray , len+1);
					newarray[0] = 1;
					newarray[1] = 0;
					System.out.println("here 0 newarray: " + Arrays.toString(newarray));
				}
				
			}	
		}

		return newarray;
}

	
	public static void main(String[] args) {
        
		MySolution6 obj = new MySolution6();
		
		int[] digits = {1,2,3};//124
		System.out.println(Arrays.toString(digits));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits)));
		System.out.println("");

		/*
		int[] digits1 = {1,2,9};//130
		System.out.println(Arrays.toString(digits1));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits1)));		
		System.out.println("");
		*/
		
		
		int[] digits2 = {1,9,9,9};//
		System.out.println(Arrays.toString(digits2));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits2)));
		System.out.println("");
		
		int[] digits3 = {9,9,9};//
		System.out.println(Arrays.toString(digits3));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits3)));
		System.out.println("");
		
		
		int[] digits4 = {9};//
		System.out.println(Arrays.toString(digits4));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits4)));
		System.out.println("");
		
		
		
		int[] digits5 = {2,4,9,3,9};
		System.out.println(Arrays.toString(digits5));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits5)));
		System.out.println("");
		
		int[] digits6 = {9,9};//
		System.out.println(Arrays.toString(digits6));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits6)));
		System.out.println("");
		
		int[] digits7 = {5,9};//
		System.out.println(Arrays.toString(digits7));
		System.out.println("result is " + Arrays.toString(obj.plusOne(digits7)));
		System.out.println("");
		
		//test
		System.out.println("");
		System.out.println("test");
		System.out.println((int)Math.floor( 7/ 2));//商为3，余数为1，
		
		
	}

}
