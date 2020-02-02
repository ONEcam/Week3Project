
public class Turn1 implements Data {
	
	@Override
	public void accelerate() {
		System.out.println("Turn1: Acceleration needs to be applied earlier ");
	}
	
	public void braking() {
		System.out.println("Turn1: Braking too early  ");
	}
	
	public void apex() {
		System.out.println("Turn1: Missed Apex");
	}
	
	public void turn_In() {
		System.out.println("Turn1: Turn In too early");
	}
	
	
	public void turn_Exit() {
		System.out.println("Turn1: Missed Exit");
	}		
	

}
