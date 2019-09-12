package strategy;

public class UseStrategy {

	public static void main(String[] args) {

		Strategy add = new Add();
		
		Strategy sub = new Sub();
		
		Context context = new Context();
		
		System.out.println("Having add algorithm as strategy");
		
		context.operation(10, 5);
		
		context.changeStrategy(sub);
		
		System.out.println("Having sub algorithm as strategy");
		
		context.operation(10, 5);
		
	}

}
