package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> productList = new ArrayList<>();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (type == 'c') {
				Product prod = new Product(name, price);
				productList.add(prod);
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				Date date = sdf.parse(manufactureDate);
				Product prod = new UsedProduct(name, price, date);
				productList.add(prod);
			} else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product prod = new ImportedProduct(name, price, customsFee);
				productList.add(prod);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product tags : productList) {
			System.out.println(tags.priceTag());
		}
		sc.close();
	}
}
