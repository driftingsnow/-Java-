//反转字符串 
package leetcode;


public class String_01 {
	public String reverseString(String s) {
		char[] array = s.toCharArray();
		char[] temps = new char[s.length()/2];
		for(int j=0; j<s.length()/2; j++) {
			temps[j] = array[j];
		}
		int k=0;
		for(int i=0; i<s.length()/2; i++) {
			array[i] = array[s.length()-1-i];
			array[s.length()-1-k] = temps[i];
			k++;
		}
		StringBuilder builder = new StringBuilder();
		for(int q=0; q<s.length(); q++) {
			builder.append(array[q]);
		}
		s = builder.toString();
        return s;
    }
	
	public static void main(String[] args) {
		String_01 obj = new String_01();
		
		String s = "abcd";
		System.out.println("Input: " + s);
		System.out.println(obj.reverseString(s));
		
		String s1 = "abcdefghij";
		System.out.println(obj.reverseString(s1));
		
		String s2 = "A man a plan a canal: Panama";
		System.out.println(obj.reverseString(s2));
		
	}

}
