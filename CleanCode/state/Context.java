package state;

public class Context {

	private State state;
	
	public Context() {
		
		state = new LightOff();
		
	}
	
	public State getState() {
		
		return state;
		
	}
	
	public void changeState(State state) {
		
		this.state = state;
		
	}
	
	public void request() {
		
		state.handle();
		
	}
	
}
