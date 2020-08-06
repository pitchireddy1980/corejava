import java.util.HashMap;
import java.util.Map;



public class IterateHashMapExample {
    public static void main(String[] args) {
        // 1. Iterate through a HashMap EntrySet using Iterator
        Map < Integer, String > coursesMap = new HashMap < Integer, String > ();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

		/*
		 * Iterator <Entry<Integer, String >> iterator =
		 * coursesMap.entrySet().iterator(); while (iterator.hasNext()) { Entry <
		 * Integer, String > entry = iterator.next();
		 * System.out.println(entry.getKey()); System.out.println(entry.getValue());
		 * iterator.remove(); }
		 */
        
        coursesMap.entrySet().stream().forEach(entry->{
        	System.out.println(entry.getValue());
        });
        
    }
}
