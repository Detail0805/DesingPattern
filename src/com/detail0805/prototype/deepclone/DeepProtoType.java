package com.detail0805.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable{
	
	public String name; //String 屬性
	public DeepCloneableTarget deepCloneableTarget;// 引用型別
	public DeepProtoType() {
		super();
	}
	
	
	//深拷貝 - 方式 1 使用clone 方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep = null;
		//這裡完成對基本數據型別(屬性)和String的克隆
		deep = super.clone(); 
		//對引用型別的屬性，進行單獨處理
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
		
		// TODO Auto-generated method stub
		return deepProtoType;
	}
	
	//深拷貝 - 方式2 通過對象的序列化實現 (推薦)
	
	public Object deepClone() {
		
		//建立流對像
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this); //目前這個對像以對像流的方式輸出
			
			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			//關閉流
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
		
	}
	
}
