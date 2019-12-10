package java8features;

import java.util.*;

interface Condition
{
	boolean test(Person p);
}

public class Java7Example {

	public static void main(String[] args) {
		List<Person>  people= Arrays.asList(
				new Person("nutan","patil",22),
				new Person("ujwal","zare",23),
				new Person("disha","agrwal",25)
				);
		
		//sort list by last name
		Collections.sort(people,new Comparator<Person>()
		{
			@Override
			public int compare(Person o1,Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		//print all element
		System.out.println("printing all person");
		printAll(people);
		
		//print all people whose last name beginning with p
		//printLastName(people);
		System.out.println("print person with lastname startswith p");
		printConditionally(people,new Condition()
				{
			@Override
			public boolean test(Person p)
			{
				return p.getLastName().startsWith("p");
			}
				});

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p:people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
		
	}

	
	private static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
		
	}

}
