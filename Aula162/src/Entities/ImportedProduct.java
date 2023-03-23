package Entities;

public class ImportedProduct extends Product {
	
	Double customsFee;
	
	
	public ImportedProduct() {
		super();
	}


	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	public Double totalPrice() {
		return super.price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.name + " $" + String.format("%.2f", totalPrice()) + " (Customs Fee: $" + String.format("%.2f )", getCustomsFee());
	}
	
	
	
	
	
	
	
	
	
}
