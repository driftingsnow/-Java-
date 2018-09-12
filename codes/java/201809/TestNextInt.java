package mainpackage;
//test 从用户那里输入信息

import java.util.Scanner;

public class TestNextInt {
	
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		if(sca.hasNext()) {
			String str = sca.next();
			System.out.println("I will return " + str + " back.");
			//Input: golden apple
			//Output: I will return golden back.
			//空格不行，如果有空格可以用hasNextLine()
		}
		
		/*test hasNextLine
		if(sca.hasNextLine()) {
			String str = sca.nextLine();
			System.out.println("I will return " + str + " back.");
			//Input: golden apple
			//Output: I will return golden apple back.
			
		}
		*/
		sca.close();
		
		
		
	}

}
