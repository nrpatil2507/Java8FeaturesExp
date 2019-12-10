package java8features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class StreamExample3 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("/home/axelor/nutan/hello.txt");
		BufferedReader br = new BufferedReader(fr) ;
		br.lines().forEach(System.out::println);
		
		
		Stream.iterate(1, i -> i+1)
				.limit(10)
				.forEach(System.out::println);
		
		
		Files.list(Paths.get("."))
		     .map(Path::getFileName) // still a path
		     .map(Path::toString) // convert to Strings
		     .sorted() // sort them alphabetically
		     .limit(5) // first 5
		     .forEach(System.out::println);
		
		
		
	}

}
