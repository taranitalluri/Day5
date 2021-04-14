package DAY5;

public class Tiger extends Animal{
	public Tiger(int legs, float d) {
		super(legs, d);
	}
	public void doPlay() {
		System.out.println("Tiger Play method  called...");
	}
	public void doFeed(int food) {
		super.weight += (food * 0.5);
		System.out.println(" Inside dog implementation of feed method "+super.weight);
	}
	public void doRun() {
		System.out.println(" Implementation of Dog Run method");
	}
	
}


