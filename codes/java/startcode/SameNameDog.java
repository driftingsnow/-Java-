package mainpackage;
//test toString()
class Dog {
	private String name;
	
	Dog(){
		name = "Luky";
	}
	
	public String toString() {
		return name;
	}
	
}


public class SameNameDog{
	private Dog samenamedog = new Dog();
	
	public String toString() {
		return "The three dogs' name is Luky: " + samenamedog;
		//return samenamedog; why error
	}


public static void main(String[] args) {
	SameNameDog theThirdSameNameDog = new SameNameDog();
	System.out.print(theThirdSameNameDog);
}
	

}
