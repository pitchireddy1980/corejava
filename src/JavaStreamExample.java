import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamExample {

	private static List<Product> productLists = new ArrayList<Product>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		productLists.add(new Product(1, "HP Laptop", 25000f));
		productLists.add(new Product(2, "Dell Laptop", 30000f));
        productLists.add(new Product(3, "Lenevo Laptop", 28000f));
        productLists.add(new Product(4, "Sony Laptop", 28000f));
        productLists.add(new Product(5, "Apple Laptop", 90000f));
       
        
        productLists.stream().
        		filter(product->product.getPrice()>25000).
        		forEach(product -> System.out.println(product.getPrice()));
        
       // productPriceList.forEach((price) -> System.out.println(price));
	}

}
