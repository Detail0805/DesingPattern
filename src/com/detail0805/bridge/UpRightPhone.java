package com.detail0805.bridge;

public class UpRightPhone extends Phone {
	
		//構造器
		public UpRightPhone(Brand brand) {
			super(brand);
		}
		
		public void open() {
			super.open();
			System.out.println(" 直立樣式手機 ");
		}
		
		public void close() {
			super.close();
			System.out.println(" 直立樣式手機 ");
		}
		
		public void call() {
			super.call();
			System.out.println(" 直立樣式手機 ");
		}
}
