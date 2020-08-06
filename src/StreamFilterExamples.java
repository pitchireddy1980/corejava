import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilterExamples {

	 private static List<Person> getPeople() {
		    return List.of(
		        new Person("Antonio", 20, Gender.MALE),
		        new Person("Alina Smith", 33, Gender.FEMALE),
		        new Person("Helen White", 57, Gender.FEMALE),
		        new Person("Alex Boz", 14, Gender.MALE),
		        new Person("Jamie Goa", 99, Gender.MALE),
		        new Person("Anna Cook", 7, Gender.FEMALE),
		        new Person("Zelda Brown", 120, Gender.FEMALE)
		    );
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = getPeople();
		
		List<Person> females = people.stream().filter(person->person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
		//females.forEach(System.out::println);
		
		/*
		 * List<Person> sorted = people.stream()
		 * .filter(person->person.getGender().equals(Gender.FEMALE))
		 * .sorted(Comparator.comparing(Person::getAge)) .collect(Collectors.toList());
		 * 
		 * boolean allMatch = people.stream() .anyMatch(person -> person.getAge()>8);
		 * 
		 * System.out.println(allMatch);
		 * 
		 * boolean anyMatch = people.stream() .anyMatch(person -> person.getAge() >
		 * 121);
		 * 
		 * System.out.println(anyMatch);
		 * 
		 * 
		 * people.stream() .max(Comparator.comparing(Person::getAge))
		 * .ifPresent(System.out::println);
		 */
					   
	    Map<Gender, List<Person>> groupByGender = people.stream().
	    		collect(Collectors.groupingBy(Person::getGender));
	    
	    
	    	groupByGender.forEach((gender, people1)->{
	    	people1.forEach(System.out::println);
	    	System.out.println();
	    	});
	}

}
