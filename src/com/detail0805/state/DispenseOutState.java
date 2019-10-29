package com.detail0805.state;

/**
 * 獎品發放完畢狀態
 * 說明，當我們activity 改變成 DispenseOutState， 抽獎活動結束
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

	// 初始化時傳入活動引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("獎品發送完了，請下次再參加");
    }

    @Override
    public boolean raffle() {
        System.out.println("獎品發送完了，請下次再參加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("獎品發送完了，請下次再參加");
    }
}
