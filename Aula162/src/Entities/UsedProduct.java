package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	DateTimeFormatter fmt1;
	LocalDate d01;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, DateTimeFormatter fmt1, LocalDate d01) {
		super(name, price);
		this.fmt1 = fmt1;
		this.d01 = d01;
	}

	
	public LocalDate getD01() {
		return d01;
	}

	public void setD01(LocalDate d01) {
		this.d01 = d01;
	}

	public String priceTag() {
		return name + " (used) $" + String.format("%.2f", price) + " (Manufacture date: " + d01.format(fmt1) + ")";
	}
	
	

}
