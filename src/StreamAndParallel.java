import java.util.Arrays;
import java.util.List;

public class StreamAndParallel {

	public static void main(String[] args) {
		   List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
			/*
			 * list.stream().forEach(System.out::println); System.out.println();
			 * list.parallelStream().forEach(System.out::println);
			 */
		      list.stream().forEach(i->System.out.println(i));
		   }

	}
    

