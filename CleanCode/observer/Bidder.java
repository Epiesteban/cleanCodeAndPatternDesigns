package observer;

public class Bidder implements Observer
{

	public void update() {

		System.out.println("Someone has appended into the Betting House collection");
		bet();
		
	}
	
	private void bet() {
		
		System.out.println("If you want to keep betting?");
		System.out.println("Add a bet");
		
	}

}
