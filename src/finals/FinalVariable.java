package finals;

public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations calculation = new Calculations(5);
		calculation.printArea();
		
		Multiplication multiplication = new Multiplication();
		multiplication.multiplication();
	}

}

class Calculations{
	
	// this is blank final variable which is initialized in constructor
	public final int LENGTH;
	
	// final variable declared at the time of declaration.
	public final int WIDTH=10;

	public Calculations() {		
		super();
		this.LENGTH = 0; // final variable is initialized in constructor.
	}

	public Calculations(int lENGTH) {
		super();
		LENGTH = lENGTH;// final variable is initialized in constructor.
	}
	
	public void printArea() {
		System.out.println("Area of rectangle is : "+LENGTH*WIDTH);
	}
}

class Multiplication{
	
	// blank final variable initialized in initializer block
	public final int valueOne;
	
	// static final variable which needs to be initialized in initializer block.
	public static final int valueTwo;
	
	{
		// blank final variable initialized in initializer block
		valueOne=25;
	}
	
	static {
		// Static blank final variable initialized here.
		valueTwo = 25;
	}
	
	public void multiplication() {
		System.out.println("\nMultiplication is : "+valueOne*valueTwo);
	}
}
