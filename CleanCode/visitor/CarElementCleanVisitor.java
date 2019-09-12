package visitor;

public class CarElementCleanVisitor implements CarElementVisitor{

	public CarElementCleanVisitor() {

	}

public void visit(Wheel wheel) {

		System.out.println("The wheel is cleaned");
		
	}
	
	public void visit(Engine engine) {

		System.out.println("The engine is cleaned");
		
	}

	public void visit(Body body) {
		
		System.out.println("The body is cleaned");
		
	}

	public void visit(Car car) {

		System.out.println("The car is cleaned");
		
	}

}
