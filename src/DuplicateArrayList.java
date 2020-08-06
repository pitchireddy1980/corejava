import java.util.ArrayList;
import java.util.List;

public class DuplicateArrayList {
	public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2); 
        al.add(10); 
  
        // Since all elements are unique, pass the first 
        // elements value to delete it 
        // Note: values are integer object 
         al.remove(0); 
  
        System.out.println("Modified ArrayList : " + al); 
    } 
}
