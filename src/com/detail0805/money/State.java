package com.detail0805.money;

/**
 * 狀態介面
 * @author Administrator
 *
 */
public interface State {

	/**
     * 電審
     */
    void checkEvent(Context context);

    /**
     * 電審失敗
     */
    void checkFailEvent(Context context);

    /**
     * 定價發佈
     */
    void makePriceEvent(Context context);

    /**
     * 接單
     */
    void acceptOrderEvent(Context context);

    /**
     * 無人接單失效
     */
    void notPeopleAcceptEvent(Context context);

    /**
     * 付款
     */
    void payOrderEvent(Context context);

    /**
     * 接單有人支付失效
     */
    void orderFailureEvent(Context context);

    /**
     * 反饋
     */
    void feedBackEvent(Context context);


    String getCurrentState();
}
