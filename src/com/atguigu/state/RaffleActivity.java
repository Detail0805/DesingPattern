package com.atguigu.state;

/**
 * 抽獎活動 //
 * 
 * @author Administrator
 *
 */
public class RaffleActivity {

	// state 表示活動目前的狀態，是變化
    State state = null;
    // 獎品數量
    int count = 0;
    
    // 四個屬性，表示四種狀態
    State noRafflleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    
    State dispenseState =   new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    //構造器
    //1. 初始化目前的狀態為 noRafflleState（即不能抽獎的狀態）
    //2. 初始化獎品的數量 
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //扣分, 呼叫目前狀態的 deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    //抽獎 
    public void raffle(){
    	// 如果目前的狀態是抽獎成功
        if(state.raffle()){
        	//領取獎品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //這裡請大家注意，每領取一次獎品，count--
    public int getCount() {
    	int curCount = count; 
    	count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
