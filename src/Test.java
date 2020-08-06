import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("a","b","c");	
		names.forEach(System.out::println);
		var numbers = List.of(1, 2, 3, 4, 5);
		
	}

}
