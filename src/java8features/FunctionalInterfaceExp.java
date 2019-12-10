package java8features;

@FunctionalInterface
interface Greeting {
	public void perform();
}

public class FunctionalInterfaceExp {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		
		FunctionalInterfaceExp greet=new FunctionalInterfaceExp();
		
		Greeting lambdagreet=()-> {System.out.println("hello from lambda expression");};
		
		greet.greet(lambdagreet);
		
		Greeting g=()->System.out.println("hello using functional interface");
		g.perform();
		
	}

}
