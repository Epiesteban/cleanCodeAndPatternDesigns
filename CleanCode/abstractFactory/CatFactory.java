package abstractFactory;

public class CatFactory implements AbstractFactory{


	public AbstractAnimal getFactory() {

		return new Cat();

	}

}
