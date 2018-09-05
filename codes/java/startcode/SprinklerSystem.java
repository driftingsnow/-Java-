package codereuse;
//Composition for code reuse
class WaterSource {
	private String s;


WaterSource(){
	System.out.println("WaterSource()");
	s = "Constructed";	
}
public String toString() {
	return s;
}
}


public class SprinklerSystem {
//	private String value1,value2,value3,value4;
	private WaterSource source = new WaterSource();		
//	private int i;
//	private float f;
	
	
	public String toString() {
		return
	
/*				
		"valve1 = " + value1 + " " +						
		"value2 = " + value2 + " " +
		"value3 = " + value3 + " " +
		"value4 = " + value4 + "\n" +
		"i =" + i + " " + "f = " + f + " "+
*/	

		"source = " + source;  
	}

 public static void main(String[] args) {
	SprinklerSystem sprinklers = new SprinklerSystem();
	System.out.println(sprinklers);
	
}

}
/* 
* sprinklers = SprinklerSystem() = has 2 methods(WaterSource() & toString())
*  WaterSource()           --->System.out.println("WaterSource()");
                           --->System.out.println("I am WaterSource()");

*  toString()              ---"source = " + source; 
*/


                     

// toString（） 返回此对象本身（它已经是个字符串）
// 语法 public String toString()
