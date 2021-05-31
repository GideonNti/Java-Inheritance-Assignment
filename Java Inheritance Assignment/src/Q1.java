
 class First {
	public void MethodA() {
		 System.out.println( "This is parent class");
	}

}
class Second extends First{
	
	public void MethodB () {
		System.out.println("This is child class");
	}
}

public class Q1{
public static void main(String[] args) {
	First obj1 = new Second();	
	Second obj2 = new Second();
		
	obj1.MethodA();
	obj2.MethodB();
	obj2.MethodA();
	}
	

}
