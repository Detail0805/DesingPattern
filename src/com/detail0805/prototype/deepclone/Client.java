package com.detail0805.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws Exception {
		int[] a = {1,2,3,4};
		System.out.println(distanceBetweenBusStops(a,0,3));
		// TODO Auto-generated method stub
//		DeepProtoType p = new DeepProtoType();
//		p.name = "宋江";
//		p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛",new Testrec());
//		p.deepCloneableTarget.testrec.age=15;
//		p.deepCloneableTarget.testrec.name="12456";
//		//方式1 完成深拷貝
//		
////		DeepProtoType p2 = (DeepProtoType) p.clone();
////		
////		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
////		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
//	
//		//方式2 完成深拷貝
//		DeepProtoType p2 = (DeepProtoType) p.deepClone();
//		
//		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println(" ::"+p.deepCloneableTarget.testrec.toString());
//		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
//		System.out.println(" ::"+p2.deepCloneableTarget.testrec.toString());
	}
	 public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
	        int sum = start + destination, total = 0, forwardDistance = 0;
	        start = Math.min(start, destination);
	        destination = sum - start;    
	        for (int d : distance)
	            total += d;
	        for (int i = start; i < destination; ++i)
	            forwardDistance += distance[i];
	        return Math.min(forwardDistance, total - forwardDistance);
	 }
}
