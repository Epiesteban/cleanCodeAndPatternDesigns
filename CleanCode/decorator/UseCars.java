package decorator;

public class UseCars {

	public static void main(String[] args) {
		
		Bmw bmw = new Bmw();
		
		System.out.println(bmw.getDescription());
		System.out.println(bmw.getPrice());
		
		TunedCar tunedBmw = new TunedCar(bmw);
		
		System.out.println(tunedBmw.getDescription());
		System.out.println(tunedBmw.getPrice());
		
	}

}
