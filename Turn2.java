
public class Turn2 implements Data {
	
	@Override
	public void accelerate() {
		System.out.println("Turn2: Acceleration OK ");
	}
	
	public void braking() {
		System.out.println("Turn2: Braking OK  ");
	}
	
	public void apex() {
		System.out.println("Turn2: Apex OK ");
	}
	
	public void turn_In() {
		System.out.println("Turn2: Turn In too early");
	}
	
	
	public void turn_Exit() {
		System.out.println("Turn2: Missed Exit");
	}		
	

}
