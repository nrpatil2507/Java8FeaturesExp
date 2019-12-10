package java8More;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8features.Person;

public class UseFunctionInterfaces {
	
	public static void main(String[] args) {
		
		 
		List<Person>  people= Arrays.asList(
				new Person("nutan","patil",22),
				new Person("ujwal","zare",23),
				new Person("disha","agrwal",25)
				);
		
		//sort list by last name
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//print all element
		
		System.out.println("printing all person");
		performConditionally(people, p->true,p-> System.out.println(p));
		
		//print all people whose last name beginning with p
		
		System.out.println("print person with lastname startswith p");
		performConditionally(people, p->p.getLastName().startsWith("p"),p-> System.out.println(p));
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
