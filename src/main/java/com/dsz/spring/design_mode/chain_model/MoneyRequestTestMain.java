package com.dsz.spring.design_mode.chain_model;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/8/9 17:12
 * @Description:
 */
public class MoneyRequestTestMain {
    public static void main(String[] args) {
        MoneyRequest moneyRequest = new MoneyRequest("shouzhi",600,"泡脚");
        FatherHandler fatherHandler = new FatherHandler();
        MotherHandler motherHandler = new MotherHandler();
        WifeHandler wifeHandler = new WifeHandler();

        fatherHandler.setNextHandler(motherHandler);
        motherHandler.setNextHandler(wifeHandler);

        fatherHandler.submit(moneyRequest);
    }



}
