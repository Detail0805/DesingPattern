package com.detail0805.money;

/**
 * 狀態列舉類
 * @author Administrator
 *
 */
public enum StateEnum {

	 //訂單產生
    GENERATE(1, "GENERATE"),

    //已審覈
    REVIEWED(2, "REVIEWED"),

    //已發佈
    PUBLISHED(3, "PUBLISHED"),

    //待付款
    NOT_PAY(4, "NOT_PAY"),

    //已付款
    PAID(5, "PAID"),

    //已完結
    FEED_BACKED(6, "FEED_BACKED");

    private int key;
    private String value;

    StateEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public int getKey() {return key;}
    public String getValue() {return value;}
}
