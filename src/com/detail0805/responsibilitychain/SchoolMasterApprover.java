package com.detail0805.responsibilitychain;

public class SchoolMasterApprover extends Approver {

	public SchoolMasterApprover(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		// TODO Auto-generated method stub
		if(purchaseRequest.getPrice() > 30000) {
			System.out.println(" 請求編號 id= " + purchaseRequest.getId() + " 被 " + this.name + " 處理");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
}
