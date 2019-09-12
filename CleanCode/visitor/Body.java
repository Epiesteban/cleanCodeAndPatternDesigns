package visitor;

public class Body implements CarElement{

	public Body() {

	}
	
	public void accept(CarElementVisitor carElementVisitor) {

		carElementVisitor.visit(this);
		
	}

}
