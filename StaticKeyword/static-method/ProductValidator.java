package com.burak.statickeyword;

public class ProductValidator {
	public static boolean isValid(Product product) {
		return product.price > 0 && !product.name.isEmpty();
	}
}
