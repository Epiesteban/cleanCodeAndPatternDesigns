package abstractFactory;

public class UseAbstractFactory {

	public static void main(String[] args) {

		CatFactory catFactory = new CatFactory();
		AbstractAnimal cat  = catFactory.getFactory();
		cat.talk();
		
		DogFactory dogFactory = new DogFactory();
		AbstractAnimal dog = dogFactory.getFactory();
		dog.talk();
		
		ParrotFactory parrotFactory = new ParrotFactory();
		AbstractAnimal parrot = parrotFactory.getFactory();
		parrot.talk();
		
		System.out.println("Job done.");
	
	}

}
