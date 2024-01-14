package finals;

public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

final class ParentOne{
	
}

// This is giving compile time error => "The type ChildOne cannot subclass the final class ParentOne"
class ChildOne extends ParentOne{
	
}


