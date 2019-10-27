package com.atguigu.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//從大到小建立對像 學校
		OrganizationComponent university = new University("清華大學", " 中國頂級大學 ");
		
		//建立 學院
		OrganizationComponent computerCollege = new College("計算機學院", " 計算機學院 ");
		OrganizationComponent infoEngineercollege = new College("資訊工程學院", " 資訊工程學院 ");
		
		
		//建立各個學院下面的系(專業)
		computerCollege.add(new Department("軟體工程", " 軟體工程不錯 "));
		computerCollege.add(new Department("網路工程", " 網路工程不錯 "));
		computerCollege.add(new Department("電腦科學與技術", " 電腦科學與技術是老牌的專業 "));
		
		//
		infoEngineercollege.add(new Department("通訊工程", " 通訊工程不好學 "));
		infoEngineercollege.add(new Department("資訊工程", " 資訊工程好學 "));
		
		//將學院加入到 學校
		university.add(computerCollege);
		university.add(infoEngineercollege);
		
		//university.print();
		infoEngineercollege.print();
	}

}
