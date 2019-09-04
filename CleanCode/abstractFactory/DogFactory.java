package abstractFactory;

public class DogFactory implements AbstractFactory{

	public AbstractAnimal getFactory() {
			
		return new Dog();

	}

}
