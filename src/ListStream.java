import java.util.Arrays;
import java.util.List;

public class ListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		System.out.println(values.stream().map(e->e*2).reduce(0, (c,e)->c+e));
		
	}

}
