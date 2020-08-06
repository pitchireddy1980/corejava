import java.util.Arrays;
import java.util.List;

public class ParallelStreamForkJoinPool {

	public static int transform(int number) {
		sleep(1000);
		return number + 1;
	}

	public static void printIt(int number) {
		System.out.println("p: " + number + ":" + Thread.currentThread());

	}

	private static boolean sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().map(e -> transform(e)).forEachOrdered(e -> printIt(e));

	}

}
