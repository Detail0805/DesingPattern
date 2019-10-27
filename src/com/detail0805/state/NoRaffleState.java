package com.atguigu.state;

/**
 * 不能抽獎狀態
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

	 // 初始化時傳入活動引用，扣除積分后改變其狀態
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 目前狀態可以扣積分 , 扣除后，將狀態設定成可以抽獎狀態
    @Override
    public void deductMoney() {
        System.out.println("扣除50積分成功，您可以抽獎了");
        activity.setState(activity.getCanRaffleState());
    }

    // 目前狀態不能抽獎
    @Override
    public boolean raffle() {
        System.out.println("扣了積分才能抽獎喔！");
        return false;
    }

    // 目前狀態不能發獎品
    @Override
    public void dispensePrize() {
        System.out.println("不能發放獎品");
    }
}
