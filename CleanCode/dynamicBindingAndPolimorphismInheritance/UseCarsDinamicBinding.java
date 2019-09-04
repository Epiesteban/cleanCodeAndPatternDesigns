package dynamicBindingAndPolimorphismInheritance;

public class UseCarsDinamicBinding{
	public static void main(String[] args) {
		Bmw bmw = new Bmw();
		Mercedes mercedes = new Mercedes();
		Opel opel = new Opel();
		//Bad smell
		badSmellComparator(bmw);
		badSmellComparator(mercedes);
		badSmellComparator(opel);
		//Good smell, using dynamic binding(line 30) when we call the method "goodSmellComparator"
		goodSmellComparator(bmw);
		goodSmellComparator(mercedes);
		goodSmellComparator(opel);
	}
	
	static void badSmellComparator(Car car) {
		if(car instanceof Bmw) {
			System.out.println("This is a BMW");
		}
		else{
			if(car instanceof Mercedes) {
			System.out.println("This is a Mercedes");
			}
			else {
				System.out.println("This is an Opel");
			}
		}
	}
	
	static void goodSmellComparator(Car car) {
		car.carInformation();
	}
}

