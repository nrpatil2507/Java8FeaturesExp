package java8features;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;



public class StreamsExamples {

	public static void main(String[] args) throws IOException {
		
		List<Person>  people= Arrays.asList(
				new Person("nutan","patil",22),
				new Person("ujwal","zare",23),
				new Person("disha","agrwal",25),
				new Person("kiran",",mistary",22)
				);
		
		people.stream().filter(p->p.getFirstName().startsWith("n"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		long count=people.parallelStream()
				.filter(p->p.getFirstName().startsWith("u"))
				.count();
		
		System.out.println("name satrts with u are:-"+count);
		
		
	}

}
