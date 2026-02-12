package com.java.Product;

import java.util.Comparator;

public class RatingComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return (int) (o1.getRating() - o2.getRating());

	}

}
