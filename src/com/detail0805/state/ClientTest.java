package com.atguigu.state;

/**
 * 狀態模式測試類
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 建立活動對象，獎品有1個獎品
        RaffleActivity activity = new RaffleActivity(1);

        // 我們連續抽300次獎
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽獎----------");
            // 參加抽獎，第一步點選扣除積分
            activity.debuctMoney();

            // 第二步抽獎
            activity.raffle();
        }
	}

}
