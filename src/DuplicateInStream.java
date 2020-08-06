import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInStream {

	public static <T> Set<T> findDuplicateInStream(List<T> list) {
		return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

		// Print the found duplicate elements
		System.out.println(findDuplicateInStream(list));
	}

}
