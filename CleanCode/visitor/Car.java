package visitor;

import java.util.LinkedList;
import java.util.List;

public class Car {
	
	private List<CarElement> carElements;

	public Car() {

		carElements = new LinkedList<>();
		
	}
	
	public void accept(CarElementVisitor carElementVisitor) {
		
		for(CarElement carElement : carElements) {
			
			carElement.accept(carElementVisitor);
			
		}
		
		carElementVisitor.visit(this);
		
	}

}
