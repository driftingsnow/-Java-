// introduction: learn break and continue
package mainpackage;
public class BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("");
		/* test original
		 *  
		 */
		System.out.println("No.0 test original loop");
		for(int i=0; i<5; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("");
		
		
		/* test break
		 *  当ℹ==3时，break 后面的循环都不执行，即取消后面所有的执行
		 */
		System.out.println("No.1 test break");
		for(int i=0; i<5; i++) {
			if (i==3) break;
			System.out.println("i = " + i);
		}
		System.out.println("");
		
		
		/* test continue
		 *  当ℹ==3时，continue 后面的当前的循环不执行，即只取消一次执行；
		 */
		System.out.println("No.2 test continue");
		for(int i=0; i<5; i++) {
			if (i==3) continue;
			System.out.println("i = " + i);
		}
		System.out.println("");
		
		

		// test continue with label
		System.out.println("No.3 test continue with label");
		label1:
		for(int j=1; j<5; j++) {
			System.out.println("j = " + j);
			for(int i=0; i<5; i++) {
				if(i==4)continue label1;
			}
		}
		System.out.println("");
	}
}

/*Summary
 * break 打碎 if 及以后的循环
 * continue 取消 当前的循环（if条件下），继续之后的循环
 * label: 感觉有没有label一个样，加上label可能是为了方便以后的人吧。知道 i=9 时，接下来要执行哪个语句
 */  
