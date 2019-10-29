package com.detail0805.flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 建立一個工廠類
		WebSiteFactory factory = new WebSiteFactory();

		// 客戶要一個以新聞形式發佈的網站
		WebSite webSite1 = factory.getWebSiteCategory("新聞");

		
		webSite1.use(new User("tom"));

		// 客戶要一個以部落格形式發佈的網站
		WebSite webSite2 = factory.getWebSiteCategory("部落格");

		webSite2.use(new User("jack"));

		// 客戶要一個以部落格形式發佈的網站
		WebSite webSite3 = factory.getWebSiteCategory("部落格");

		webSite3.use(new User("smith"));

		// 客戶要一個以部落格形式發佈的網站
		WebSite webSite4 = factory.getWebSiteCategory("部落格");

		webSite4.use(new User("king"));
		
		System.out.println("網站的分類共=" + factory.getWebSiteCount());
	}

}
