import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapQue {

	public static void main(String[] args) {

		Map<String, Integer> map = new TreeMap<>();

		map.put("Apple", 1);
		map.put("Dog", 2);
		map.put("Cat", 10);
//		map.put("Dog", 15);

		for (Map.Entry<String, Integer> ok : map.entrySet()) {
			System.err.println(ok);
		}

		map.forEach((a, b) -> {
			System.out.println(a + " " + b);
		});
///////////////////////////////////////////////////////////////////////////////////////
		Map<String, Integer> hashMap = new HashMap<>();

		hashMap.put("ox", 65);
		hashMap.put("fox", 6);
		hashMap.put("got", 10);
		
	List<?>  sortedList =	hashMap.entrySet()
		                    .stream()
		                    .sorted(Map.Entry.comparingByValue())
		                    .collect(Collectors.toList());

	
	sortedList.forEach(System.out::println);
	}

}
