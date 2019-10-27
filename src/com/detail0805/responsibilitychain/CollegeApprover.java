package com.atguigu.responsibilitychain;

public class CollegeApprover extends Approver {

	public CollegeApprover(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		// TODO Auto-generated method stub
		if(purchaseRequest.getPrice() < 5000 && purchaseRequest.getPrice() <= 10000) {
			System.out.println(" 請求編號 id= " + purchaseRequest.getId() + " 被 " + this.name + " 處理");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
}
