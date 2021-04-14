package DAY5;

public class Cat extends Animal {

	public Cat(int legs, float weight) {
		super(legs, weight);
		
	}
	
	public void doPlay()
	{
		System.out.println("cat play method called...");
	}
	public void drinkMilk() {
		super.weight += weight * 0.2;
		System.out.println("weight of cat is "+super.weight);
	}
	
	

}