package visitor;

public class UseVisitor {

	public static void main(String[] args) {

		Wheel wheel = new Wheel();
		Engine engine = new Engine();
		Body body = new Body();
		Car car = new Car();
		
		CarElementBreakVisitor carElementBreakVisitor = new CarElementBreakVisitor();
		
		carElementBreakVisitor.visit(wheel);
		carElementBreakVisitor.visit(engine);
		carElementBreakVisitor.visit(body);
		carElementBreakVisitor.visit(car);
		
		CarElementCleanVisitor carElementCleanVisitor = new CarElementCleanVisitor();
		
		carElementCleanVisitor.visit(wheel);
		carElementCleanVisitor.visit(engine);
		carElementCleanVisitor.visit(body);
		carElementCleanVisitor.visit(car);
	}

}
