import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {

	static char firstRepeating(char[] str) {
		Set<Character> h = new HashSet<Character>();
		
		for (int i=0;i<=str.length-1;i++) {
			
			char c = str[i];
			if (h.contains(c)) {
				return c;
			} else {
				h.add(c);
			}
		}
		
		
	
		return '\0';
		
	}
	public static void main(String[] args) {
	
		String str = "pitchireddy"; 
        char[] arr = str.toCharArray(); 
        System.out.println(firstRepeating(arr)); 

	}

}



