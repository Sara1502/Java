package app;

import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class ProgramProduct {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adicione as informações do produto: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity: ");
		Product product= new Product(name, price);

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number os products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProduct(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}