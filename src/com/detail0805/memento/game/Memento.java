package com.detail0805.memento.game;

public class Memento {

	//攻擊力
	private int vit;
	//防禦力
	private int def;
	public Memento(int vit, int def) {
		super();
		this.vit = vit;
		this.def = def;
	}
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
	
	
}
