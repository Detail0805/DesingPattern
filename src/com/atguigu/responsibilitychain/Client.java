package com.atguigu.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立一個請求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
		
		//建立相關的審批人
		DepartmentApprover departmentApprover = new DepartmentApprover("張主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院長");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校長");
	
	
		//需要將各個審批級別的下一個設定好 (處理人構成環形: )
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		
		
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
