package com.detail0805.money;

/**測試類*/
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
        context.setState(new PublishState());
        //然後可以根據操作變化狀態.
        
        //publish --> not pay
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
