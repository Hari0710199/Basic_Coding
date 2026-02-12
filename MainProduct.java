package com.java.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainProduct {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "santoor", 4.5, 24.0));
		list.add(new Product(3, "cintool", 3.5, 56.0));
		list.add(new Product(4, "pears", 5.0, 89.0));
		list.add(new Product(2, "dove", 2.5, 12.0));

		// printing list
		System.out.println("Printing list : " + list);

		// using natural sort
		Collections.sort(list);

		System.out.println("Printing sorting by Id: " + list);

		// using collections.sort and pass the custom Comparator instance
		Collections.sort(list, new RatingComparator());

		System.out.println("Sorted by Rating: " + list);

		// using Java 8 approach sorting by name
		list.sort(Comparator.comparing(Product::getProductName));
		System.out.println("Sorting by name using Java 8 : " + list);

		// using Java 8 approach sorting by price ascending
		list.sort(Comparator.comparing(Product::getPrice));
		System.out.println("Sorting by price using Java 8 : " + list);

		// using Java 8 approach sorting by price descending
		list.sort(Comparator.comparing(Product::getPrice).reversed());
		System.out.println("Sorting by price desending using Java 8 : " + list);

		// using Java 8 approach sorting by rating ascending
		list.sort(Comparator.comparing(Product::getRating));
		System.out.println("Sorting by rating using Java 8 : " + list);

		// using Java 8 approach sorting by price descending
		list.sort(Comparator.comparing(Product::getRating).reversed());
		System.out.println("Sorting by rating desending using Java 8 : " + list);
	}
}
