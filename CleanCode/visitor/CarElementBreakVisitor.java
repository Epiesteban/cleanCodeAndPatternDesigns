package visitor;

public class CarElementBreakVisitor implements CarElementVisitor{

	public CarElementBreakVisitor() {

	}

	public void visit(Wheel wheel) {

		System.out.println("The wheel is broken");
		
	}
	
	public void visit(Engine engine) {

		System.out.println("The engine is broken");
		
	}

	public void visit(Body body) {
		
		System.out.println("The body is broken");
		
	}

	public void visit(Car car) {

		System.out.println("The car is broken");
		
	}
	
}
