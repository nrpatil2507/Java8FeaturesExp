package java8More;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8features.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		 
		List<Person>  people= Arrays.asList(
				new Person("nutan","patil",22),
				new Person("ujwal","zare",23),
				new Person("disha","agrwal",25),
				new Person("kiran",",mistary",22)
				);
		
		//sort list by last name
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//print all element
		
		System.out.println("--------------printing all person data------------");
		performConditionally(people, p->true,System.out::println);// method references of ()->method(p)
		
		//print all people whose last name beginning with p
		
		System.out.println("print person with lastname startswith p");
		performConditionally(people, p->p.getLastName().startsWith("p"),System.out::println);// method references of ()->method(p)
		
	}

	private static void performConditionally(List<Person> people, Predicate<Person>predicate,Consumer<Person> consumer) {
		for(Person p:people)
		{
			if(predicate.test(p))
			{
				consumer.accept(p);
			}
		}
		
	}
}
