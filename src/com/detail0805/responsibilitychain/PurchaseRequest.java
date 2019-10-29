package com.detail0805.responsibilitychain;


//請求類
public class PurchaseRequest {

	private int type = 0; //請求型別
	private float price = 0.0f; //請求金額
	private int id = 0;
	//構造器
	public PurchaseRequest(int type, float price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public float getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	
	
	
	
	
}
