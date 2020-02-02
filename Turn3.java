
public class Turn3 implements Data {
	
	@Override
	public void accelerate() {
		System.out.println("Turn3: Acceleration OK ");
	}
	
	public void braking() {
		System.out.println("Turn3: Braking OK  ");
	}
	
	public void apex() {
		System.out.println("Turn3: Apex missed ");
	}
	
	public void turn_In() {
		System.out.println("Turn3: Turn In OK");
	}
	
	
	public void turn_Exit() {
		System.out.println("Turn3: Missed Exit");
	}		
	

}
