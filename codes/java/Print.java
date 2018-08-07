//: /Users/apple/eclipse-workspace/NewProject/src/pa16/Print.java
// Print methods that can be used without qualifiers, using java SE5 static imports;

package pa16;
import java.io.*;
import java.util.Date;

public class Print {

static Date date=new Date();



/*	
 * 以下几个太简单了，不详细写了
// Print with a newline:
	public static void print(Object obj) {
		System.out.println(obj);
	}
*/
	
	
//Print a newline by itself:
	public static void print() {
		System.out.println();    
	}



/*
// Print with no line break:
	public static void printnb(Object obj) {
		System.out.print(obj);   
	}
*/


//下面这个比较难
//代码参考：https://www.tutorialspoint.com/java/io/console_printf.htm	
// The new Java SE5 print() (from C):
	public static PrintStream
    printf(String format, Object... args) {  
		return System.out.printf(format,args);
	}





public static void main(String[] args) {
/*	
	String fmt0 = "%1$4s %2$10s %3$10s%n";
	// format
    printf(fmt0, "Items", "Quanity", "Price");
    printf(fmt0, "------", "------", "------");
    printf(fmt0, "Tomato", "1Kg", "15");
    printf(fmt0, "Potato", "5Kg", "50");
    printf(fmt0, "Onion", "2Kg", "30");
    printf(fmt0, "Apple", "4Kg", "80");	
*/
	
/*    
    String fmt1 = "%s %c %b %d %x %o %f %a %e %g %h %% %n %tx";
    printf(fmt1,"sentence","sentence1",1<0,88.123,88.123,88.123,
    		88.123,88.123,88.123,88.123,
    		"sanliema",56,"huanhangfu",20180806);
*/    
    
	String fmt1 = "%s %c %b";
	printf(fmt1,"apple",'M',1>2);
	
	print();
	
	String fmt2 = "%tF%n";
	printf(fmt2,date);
	
	printf(date.toString());
	
	//%s String
	//%c Char
	//%b Boolean
	//%d 整数类型（十进制）
	

//更多有关字符格式化的内容参考https://blog.csdn.net/lonely_fireworks/article/details/7962171	
	
	
}
}








