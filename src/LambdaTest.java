import java.util.Arrays;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		
		List<Integer> value = Arrays.asList(12,20,35,46,55,68,75);
		
		int result = 0;
		for (int i: value) {
			if(i%5==0) {
				result +=i;
			}
		}
		
		System.out.println(result);
		System.out.println(value.stream().filter(i->i%5==0).reduce(0, (c,e)->c+e));

	}

}
