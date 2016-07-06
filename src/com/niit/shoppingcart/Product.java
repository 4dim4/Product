package com.niit.shoppingcart;

public class Product {

	private String prodId, prodName;
	private int price;

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProdId() {
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public int getPrice() {
		if(price<0){
			System.out.println("Invalid Entry");
		}
		return price;
	}

}
