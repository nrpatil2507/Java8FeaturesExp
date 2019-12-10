package java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) throws IOException {
		//1.integer Stream
				IntStream.range(1, 10)
							.limit(5)
						 .forEach(System.out::println);
				System.out.println();
				
				//2.integer stream with skip
				IntStream.range(1, 10)
					     .skip(5)
					     .forEach(x->System.out.println(x));
				System.out.println();
				
				//3.integer stream with sum
				
				System.out.println(
						IntStream.range(1, 5)
						.sum());
				System.out.println();
				
				//4.Stream.of sorted and find first
				Stream.of("nutan","ujwal","dip","sandip")
						.sorted()
						.findFirst()
						.ifPresent(System.out::println);
				
				//5.Stream from array,sort,filter and print
				String[] names= {"ashu","bhavna","kiyara","lina","kavya"};
				Arrays.stream(names)
				.filter(x->x.startsWith("k"))
				.sorted()
				.forEach(System.out::println);
				
				//6.average of squares of an int array
				Arrays.stream(new int[] {2,4,6,8,10})
					  .map(x->x*x)
					  .average()
					  .ifPresent(System.out::println);
				
				//7.Stream from list,filter and print
				List<String> list=Arrays.asList("ali","bharti","ankita","sona");
				list
				.stream()
				.map(String::toLowerCase)
				.filter(x->x.startsWith("a"))
				.forEach(System.out::println);
				
		    	//8.Stream rows from text file,sort,filter and print
				Stream<String> demo=Files.lines(Paths.get("/home/axelor/nutan/abc.txt"));
				demo
				.sorted()
				.filter(x->x.length()>10)
				.forEach(System.out::println);
				demo.close();
				
				//9.Stream rows from text file and save to list
				List<String> band=Files.lines(Paths.get("/home/axelor/nutan/abc.txt"))
						.filter(x->x.contains("hel"))
						.collect(Collectors.toList());
				band.forEach(x->System.out.println(x));
				
				//10.reduction -sum
				double total=Stream.of(7.3,1.4,4.8)
						.reduce(0.0, (Double a ,Double b)->a+b);
				System.out.println("Total="+total);
						
				//11.reduction -summary statistics
				IntSummaryStatistics summary=IntStream.of(7,2,19,88,73,4,10)
						.summaryStatistics();
				System.out.println(summary);
				
				//list paths of current directory
				Files.list(Paths.get("."))
			    .forEach(System.out::println);

	}

}
