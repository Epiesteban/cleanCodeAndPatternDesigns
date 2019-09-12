package decorator;

public class TunedCar implements Car{

	private Car car;
	
	public TunedCar(Car car) {
		
		this.car = car;
	
	}

	public String getDescription() {
	
		return car.getDescription() + " with some tunning.";
	
	}

	public int getPrice() {
	
		return car.getPrice() + 10000;
	
	}
	
}
