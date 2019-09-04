package dynamicBindingAndPolimorphismInheritance;

public class UseCarsPolimorphismInheritance {
	public static void main(String[] args) {
		//Bad smell, creating one new object for each class and calling the same method
		badSmell();
		//Good smell, using dinamic binding
		dinamicBinding();
	}
	
	private static void badSmell() {
		Bmw bmw = new Bmw();
		bmw.carInformation();
		Mercedes mercedes = new Mercedes();
		mercedes.carInformation();
		Opel opel = new Opel();
		opel.carInformation();
	}
	
	private static void dinamicBinding() {
		Car bmw = new Bmw();
		bmw.carInformation();
		bmw = new Mercedes();
		bmw.carInformation();
		bmw = new Opel();
		bmw.carInformation();
	}
}
