package work1.day1;

public class Bicycle {
	
	//2 Methods,2 Variables
	//rideCycle,ringBell
	
	//2 Variables (brand,tyreWidth
	
	String brand ="Hercules";
	int tyreWidht = 6;
	
	public void rideycle()
	{
		System.out.println("I am riding cycle");
	}

	public boolean ringBell()
	{
		return true;
		
	}
	
	//How to call these methods
	
	public static void main(String[] args) {
		
		//Step 1: Create a reference for the class
		//Syntax: ClassName obj= new ClassName();
		Bicycle cycle= new Bicycle();
		
		//Step 2: Call the method using reference
		//Syntax:obj.methodName();
		cycle.rideycle();
		
		cycle.ringBell();
		
		
		//
		System.out.println("ringBell");
		
		//Print the variable
		int tyreWidht2 = cycle.tyreWidht;
	}
}

