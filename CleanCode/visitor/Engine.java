package visitor;

public class Engine implements CarElement{

	public Engine() {

	}

	public void accept(CarElementVisitor carElementVisitor) {

		carElementVisitor.visit(this);
		
	}

}
