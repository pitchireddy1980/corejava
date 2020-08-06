import java.util.HashMap;

public class HashMapJava8 {
	
	public static void main(String[] args) {

	// Create a HashMap 
    HashMap<Integer, String> 
        map = new HashMap<>(); 

    // Populate the HashMap 
    map.put(1, "Geeks");
    map.put(2, "ForGeeks"); 
    map.put(3, "GeeksForGeeks"); 

    // Get the value to be removed 
    String valueToBeRemoved = "ForGeeks"; 

    // Print the initial HashMap 
    System.out.println("Original HashMap: "    + map); 

    // Remove the specified entry from the Map 
    map.entrySet() 
        .removeIf(
            entry -> (valueToBeRemoved.equals(entry.getValue()))); 


    // Print the modified HashMap 
    System.out.println("Modified HashMap: "
                       + map); 
} 
}
