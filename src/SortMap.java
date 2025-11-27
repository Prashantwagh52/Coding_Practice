import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "jh");
		map.put(34, "ds");
		map.put(22, "aws");
		map.put(5, "er");

		List<Entry<Integer, String>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toList());

		sorted.forEach(e -> {
			System.err.println(e);
		});

	}
}
