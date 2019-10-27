package com.atguigu.state;

import java.util.Random;

/**
 * 可以抽獎的狀態
 * @author Administrator
 *
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已經扣除了積分，不能再扣
    @Override
    public void deductMoney() {
        System.out.println("已經扣取過了積分");
    }

    //可以抽獎, 抽完獎后，根據實際情況，改成新的狀態
    @Override
    public boolean raffle() {
        System.out.println("正在抽獎，請稍等！");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中獎機會
        if(num == 0){
            // 改變活動狀態為發放獎品 context
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遺憾沒有抽中獎品！");
            // 改變狀態為不能抽獎
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    // 不能發放獎品
    @Override
    public void dispensePrize() {
        System.out.println("沒中獎，不能發放獎品");
    }
}
