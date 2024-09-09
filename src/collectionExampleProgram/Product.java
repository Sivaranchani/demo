package collectionExampleProgram;
import java.util.*;

class Product {
String name;
double price;

Product(String name, double price){
	this.name = name;
	this.price = price;
}

@Override
public String toString() {
	return name+ ":$"+ price;
}


public static void main(String[] args) {
List<Product> products = new ArrayList<>(Arrays.asList(
      new Product ("Laptop",999.99),	
      new Product ("Smartphone",599.99),
      new Product ("Tablet",399.99),
      new Product ("Monitor",199.99)
      ));
 
// Find the product with the maximum price
Product maxPricedProduct = products.stream()
.max(Comparator.comparingDouble(p->p.price))
.orElseThrow(NoSuchElementException::new);

//Print the product with the maximum price
System.out.println("Max priced product: "+ maxPricedProduct);

}
}
