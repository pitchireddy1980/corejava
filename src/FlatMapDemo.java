import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		String[][] strArray = new String[][] {{"a","b"},{"c","d"},{"e","f"}};
		//Stream<String[]>
		Stream<String[]> strArrayStream = Arrays.stream(strArray);
		
		//convert Stream<String[]> to Stream<String>
		Stream<String> strStream = strArrayStream.flatMap(x->Arrays.stream(x));
		
		//filter a stream of string
		Stream<String> filtedStream = strStream.filter(x->"c".equals(x.toString()));
		
		filtedStream.forEach(System.out::println);
		
		

	}

}
