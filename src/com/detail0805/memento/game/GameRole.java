package com.atguigu.memento.game;

public class GameRole {

	private int vit;
	private int def;
	
	//建立Memento ,即根據目前的狀態得到Memento
	public Memento createMemento() {
		return new Memento(vit, def);
	}
	
	//從備忘錄對象，恢復GameRole的狀態
	public void recoverGameRoleFromMemento(Memento memento) {
		this.vit = memento.getVit();
		this.def = memento.getDef();
	}
	
	//顯示目前遊戲角色的狀態
	public void display() {
		System.out.println("遊戲角色當前的攻擊力：" + this.vit + " 防禦力: " + this.def);
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
