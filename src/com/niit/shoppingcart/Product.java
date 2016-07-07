package com.niit.shoppingcart;

public class Product {

	private String prodId, prodName;
	private int price;
	
	public Product(String prodId,String prodName) {
		this.prodId=prodId;
		this.prodName=prodName;
	}
	public Product(String prodId,String prodName,int price) {
		this.prodId=prodId;
		this.prodName=prodName;
		this.price=price;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public void setPrice(int price) {
		if(price<0) {
			System.out.println("Invalid Entry");
		}
		else {
		this.price = price;
		}
	}

	public String getProdId() {
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public int getPrice() {
		return price;
	}

}





