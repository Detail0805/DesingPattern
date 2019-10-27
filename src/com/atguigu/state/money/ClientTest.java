package com.atguigu.state.money;

/**測試類*/
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立context 對像
		Context context = new Context();
        //將目前狀態設定為 PublishState
		context.setState(new PublishState());
        System.out.println(context.getCurrentState());
        
//        //publish --> not pay
        context.acceptOrderEvent(context);
//        //not pay --> paid
        context.payOrderEvent(context);
//        // 失敗, 檢測失敗時，會拋出異常
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("流程正常..");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
        
	}

}
