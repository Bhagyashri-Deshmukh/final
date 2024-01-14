package finals;

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		parent.printPersonInfo();
		
		Parent parentChild = new Child();
		parentChild.printPersonInfo();
	}

}

class Parent{
	
	public final void printPersonInfo() {		
		System.out.println("In side parent method......");
	}
}

class Child extends Parent{
	
	// It will give compile time error that final method could not be overridden.
	@Override
	public void printPersonInfo() {
		System.out.println("In side child method......");
	}
}
