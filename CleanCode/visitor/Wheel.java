package visitor;

public class Wheel implements CarElement{

	public Wheel() {

	}

	public void accept(CarElementVisitor carElementVisitor) {

		carElementVisitor.visit(this);
		
	}

}
