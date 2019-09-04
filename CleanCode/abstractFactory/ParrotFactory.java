package abstractFactory;

public class ParrotFactory implements AbstractFactory{

	public AbstractAnimal getFactory() {
		
		return new Parrot();

	}

}
