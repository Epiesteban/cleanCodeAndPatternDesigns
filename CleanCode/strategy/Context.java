package strategy;

public class Context {
	
	private Strategy strategy;

	public Context() {
		
		strategy = new Add();
		
	}
	
	public void changeStrategy(Strategy strategy) {
		
		this.strategy = strategy;
	
	}
	
	public void operation(int x, int y) {
		
		System.out.println("...");

		System.out.println(strategy.algorithm(x, y));
		
		System.out.println("...");
		
	}
	
}
