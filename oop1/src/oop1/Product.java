package oop1;

public class Product {
	private String name;
	private double ınitPrice;
	private double discount;
	private String imageUrl;
	private int unitInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitPrice() {
		return ınitPrice;
	}

	public void setInitPrice(double initPrice) {
		ınitPrice = initPrice;
	}

	public double getDiscount() {
		discount = discount+5;
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

}
