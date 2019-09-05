package adapter;

public class ProcesAdapter implements FirstProces, SecondProces{

	public void procesNumberOne() {
		
		System.out.println("This is the proces number one.");
		
	}
	
	public void procesNumberTwo() {
		
		System.out.println("This is the proces number two.");
	}
	
	public void proces() {
		
		procesNumberOne();
		
		procesNumberTwo();
		
	}
	
}
