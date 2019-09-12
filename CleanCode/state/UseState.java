package state;

public class UseState {

	public static void main(String[] args) {
	
		Context context = new Context();
		
		System.out.println(context.getState().handle());
		
		State lightOn = new LightOn();
		
		State lightOff = new LightOff();
		
		context.changeState(lightOn);
		
		System.out.println("We switch on the light.");
		
		System.out.println(context.getState().handle());

		context.changeState(lightOff);

		System.out.println("We switch off the light.");
		
		System.out.println(context.getState().handle());

	}

}
