package java8More;

import java.util.Arrays;
import java.util.List;

class mydata
{
	public static void show() {
		System.out.println("hello from mydata");
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		Thread t=new Thread(MethodReferenceExample::printMsg);//method reference :: printMsg===()->printMsg() ()->method
		t.start();
		
		List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
		
		messages.forEach(System.out::println);//shortcut of below syntax
		
		for (String p : messages) {
			System.out.println(p);
		}
	}
	public static void printMsg() {
	System.out.println("hello from methodreferece");
	}

}
