package java8More;


import java.util.Arrays;
import java.util.List;

import java8features.Person;

public class ForEachExample {

	public static void main(String[] args) {
		 
		List<Person>  people= Arrays.asList(
				new Person("nutan","patil",22),
				new Person("ujwal","zare",23),
				new Person("disha","agrwal",25),
				new Person("kiran",",mistary",22)
				);
		
		//external iterator in collection
		System.out.println("using for loop");
		
		for(int i=0;i<people.size();i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("using for Each loop");
		for(Person p:people)
		{
			System.out.println(p);
		}
		//internal iterators
		System.out.println("using lambda for Each loop");
		people.forEach(p->System.out.println(p));
		
		System.out.println("using lambda method reference for Each loop");
		people.forEach(System.out::println);
	}

}
