package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List <Product> list = new ArrayList<>();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc. next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fer: ");
				Double customsFee = sc.nextDouble();
				Product pr = new ImportedProduct(name, price, customsFee);
				list.add(pr);
				
			}
			
			else if(ch == 'u') {
				System.out.print("Manufactore date(DD/MM/YYYY): ");
				LocalDate d01 = LocalDate.parse(sc.next(), fmt1);
				Product pr = new UsedProduct(name, price, fmt1, d01);
				list.add(pr);
				
			}
			
			else {
				Product pr = new Product(name, price);
				list.add(pr);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product pr : list) {
			System.out.println(pr.priceTag());
		}
		
		
		
		sc.close();
	}

}
