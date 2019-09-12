package observer;

import java.util.LinkedList;
import java.util.List;

public class BettingHouse {

	private List<Observer> observerCollection;
	
	public BettingHouse() {
		
		observerCollection = new LinkedList<>();
		
	}
	
	public void registerObserver(Observer observer) {
		
		observerCollection.add(observer);
		notifyObservers();
		
	}
	
	public void unregisterObserver(Observer observer) {
		
		observerCollection.remove(observer);
		
	}
	
	public void notifyObservers() {
		
		for (Observer observer : observerCollection) {
			
			observer.update();
			
		}
		
	}
	
}
