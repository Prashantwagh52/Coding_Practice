import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(3, 7, 1, 4, 9, 2);
		 
		 numbers.stream().sorted().forEach(System.out::println);
		 
		 List<Integer> desc = numbers.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
		 
		 List<Integer> collect = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 
		 desc.forEach(e->{
			 System.err.println(e);
		 });
	}
}
