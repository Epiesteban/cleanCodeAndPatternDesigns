package observer;

public class UseBettingHouse {

	public static void main(String[] args) {

		System.out.println("We create 2 bidders.");
		Observer observer1 = new Bidder();
		Observer observer2 = new Bidder();
		
		System.out.println("We create the betting house.");
		BettingHouse bettingHouse = new BettingHouse();
		
		System.out.println("We register the first observer.");
		bettingHouse.registerObserver(observer1);
		System.out.println("We register the second observer.");
		bettingHouse.registerObserver(observer2);
		
	}

}
