package classesWithAttributes;

public class Main {
	public static void main(String[] args) {
		
		Product product1 = new Product(2,"asdf","sdfg",4141,2,"edfhb"); 
		
		Product product = new Product();
		
		product.set_name("Laptop");
		product.setId(1);
		product.set_description("asus");
		product.set_price(500);
		product.set_stockAmount(5);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product1.get_name());
		
		System.out.println(product.getId());
	}

}
