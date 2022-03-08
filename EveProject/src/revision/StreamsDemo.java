package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> str=Stream.of("hello","hai","bai");
		
		List<String> al=Arrays.asList("hello","hai","hai","sai","hai");
		
		Stream<String> str2=al.stream();
		
		//str2.distinct().forEach(System.out::println);
		
		str2.parallel().forEachOrdered(System.out::println);
	}

}
