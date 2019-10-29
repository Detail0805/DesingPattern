package com.detail0805.responsibilitychain;

public abstract class Approver {

	Approver approver;  //下一個處理者
	String name; // 名字
	
	public Approver(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	//下一個處理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	//處理審批請求的方法，得到一個請求, 處理是子類完成，因此該方法做成抽像
	public abstract void processRequest(PurchaseRequest purchaseRequest);
	
}
