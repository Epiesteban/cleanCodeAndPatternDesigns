package state;

public class LightOff implements State{
	
	public LightOff() {
		
	}

	public String handle() {

		return "The light is not shinning.";
		
	}

}
