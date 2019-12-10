package java8features;
import static java.lang.System.out;
import java.util.*;


public class LambdaExpression {
	Runnable r1 = () -> out.println(this);
	Runnable r2 = () -> out.println(toString());
	
	public String toString() {
	return "hello using scope";
	}
	public static void main(String[] args) {
		
		new LambdaExpression().r1.run();
		new LambdaExpression().r2.run();
		 
		List<Person>  people= Arrays.asList(
				new Person("nutan","patil",22),
				new Person("ujwal","zare",23),
				new Person("disha","agrwal",25)
				);
		
		//sort list by last name
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//print all element
		System.out.println("printing all person");
		printConditionally(people, p->true);
		
		//print all people whose last name beginning with p
		
		System.out.println("print person with lastname startswith p");
		printConditionally(people,p->p.getLastName().startsWith("p"));
	}

	private static void printConditionally(List<Person> people, Condition condition){
		for(Person p:people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
		
	}

	


}
