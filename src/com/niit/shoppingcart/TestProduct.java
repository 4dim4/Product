package com.niit.shoppingcart;

import java.util.ArrayList;

public class TestProduct {

	public static void main(String[] args) {
		Product p = new Product("PRD01","ASUS",5000);
		ArrayList<Product> prd=new ArrayList<Product>();
        prd.add(p);
        p = new Product("PRD02","DELL",3000);
        prd.add(p);
        p = new Product("PRD03","HP",10000);
        prd.add(p);
		
        for(Product pr : prd){
        	System.out.println(pr.getProdId());
        	System.out.println(pr.getProdName());
        	System.out.println(pr.getPrice());
        }
		
	}

}
