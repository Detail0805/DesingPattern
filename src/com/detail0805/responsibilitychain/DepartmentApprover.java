package com.atguigu.responsibilitychain;

public class DepartmentApprover extends Approver {

	
	public DepartmentApprover(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		// TODO Auto-generated method stub
		if(purchaseRequest.getPrice() <= 5000) {
			System.out.println(" 請求編號 id= " + purchaseRequest.getId() + " 被 " + this.name + " 處理");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}

}
