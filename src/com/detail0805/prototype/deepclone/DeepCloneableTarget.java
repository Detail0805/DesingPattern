package com.detail0805.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	
	public Testrec testrec;
	
	public DeepCloneableTarget(String cloneName, String cloneClass, Testrec testrec) {
		super();
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
		this.testrec = testrec;
	}

	//構造器
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	//因為該類的屬性，都是String , 因此我們這裡使用預設的clone完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
