/**
 * Question – Store Expensive Products

Create a Product class:

· id

· productName

· price


Given a list of products, store products whose price is greater than 1000.

Tasks

1. Use filter()

2. Use toList()

3. Print final list
 */
package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Product {
	int productId;
	String productName;
	double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && productId == other.productId
				&& Objects.equals(productName, other.productName);
	}
	
	
}
/**
 * 
 */
public class WeeklyAssignment9_StreamObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product p1=new Product(1,"Shirt",1300.0);
    Product p2=new Product(2,"Jeans",2000.0);
    Product p3=new Product(3,"Jacket",3000.0);
    Product p4=new Product(4,"Kurta",2500.0);
    List<Product> list=new ArrayList<Product>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    
    list.stream()
    .filter(s->s.price >=2000)
    .toList()
    .forEach(s->System.out.println(s.productId + " " + s.productName + " " + s.price));
	}

}
