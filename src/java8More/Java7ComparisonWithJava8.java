package java8More;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8features.Person;

public class Java7ComparisonWithJava8 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "World!", "How", "Are", "You");
		
		List<Person>  people= Arrays.asList(
				new Person("nutan","patil",22),
				new Person("ujwal","zare",23),
				new Person("disha","agrwal",25),
				new Person("kiran",",mistary",22)
				);
		
		// Java 7
		 ActionListener al = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.out.println(e.getActionCommand());
		     }
		 };
		 // Java 8
		ActionListener al8 = e -> System.out.println(e.getActionCommand());
		
		//sorting in java7
		System.out.println("---Sorting in java7--");
		Collections.sort(people, new Comparator<Person>() {
			      @Override
			     public int compare(Person p1, Person p2) {
			         int n = p1.getLastName().compareTo(p2.getLastName());
			         if (n == 0) {
			             return p1.getFirstName().compareTo(p2.getFirstName());
			        }
			        return n;
			    }
			});
		System.out.println(people);
		
		//sorting in java8
		System.out.println("----Sorting in Java8---");
		people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
		System.out.println(people);
		
		//sorting a list java7
		System.out.println("sorting a list of Strings in java7");
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				return s1.length()-s2.length();
			}
		});
		//printing a list in java7
		System.out.println("Printing out a list of Strings in java7");
		for (String s : list) {
			    System.out.println(s);
			 }
		
		//sorting a list in java8
		System.out.println("sorting a list of Strings in java8");
		Collections.sort(list,(s1,s2)->s1.length()-s2.length());
		list.sort(Comparator.comparing(String::length));
		
		//printing a list in java8
		System.out.println("Printing out a list of Strings in java8");
		list.forEach(System.out::println);
		
	}

}
