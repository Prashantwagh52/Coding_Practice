import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxAndMin {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(7, 2, 10, 4, 6);

		Optional<Integer> max = numbers.stream().max(Integer::compareTo);

		Optional<Integer> reduce = numbers.stream().reduce(Integer::max);
		
		OptionalInt max2 = numbers.stream().mapToInt(Integer::intValue).max();
		
		Optional<Integer> max3 = numbers.stream().max(Comparator.comparingInt(Integer::intValue));

		reduce.ifPresent(e -> {
			System.out.println(e);
			System.err.println(max);
			System.out.println(max2);
			System.err.println(max3);
			
		});

	}
}
