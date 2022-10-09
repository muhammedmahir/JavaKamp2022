package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setInitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("szdfg");
		
		Product product2 = new Product();
		product2.setName("Delonghi Kahve Makinesi");
		product2.setDiscount(7);
		product2.setInitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("szdfg");
		
		Product product3 = new Product();
		product3.setName("Delonghi Kahve Makinesi");
		product3.setDiscount(7);
		product3.setInitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("szdfg");
		
		Product[] products = {product1,product3,product3};
		
		System.out.println("<ul>");
		for(Product product:products) {
			System.out.println("<li>" + product.getName() + "<li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("145135");
		individualCustomer.setCustomerNumber("5124");
		individualCustomer.setFirstName("MAHİR");
		individualCustomer.setLastName("Koçbıyık");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setPhone("145135");
		corporateCustomer.setCustomerNumber("5124");
		corporateCustomer.setCompanyName("MAHİR");
		corporateCustomer.setTaxNumber("Koçbıyık");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
	}

}
