package com.niit.shoppingcart;

public class TestProduct {

	public static void main(String[] args) {
		Product p = new Product();
		p.setProdId("PRD01");
		p.setProdName("ASUS");
		p.setPrice(50000);
		System.out.println(p.getProdId());
		System.out.println(p.getProdName());
		System.out.println(p.getPrice());

	}

}
