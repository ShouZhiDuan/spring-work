package com.dsz.spring.design_mode.chain_model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/8/9 16:24
 * @Description: 审批抽象定义
 */
@Data
@Slf4j
public abstract class Handler {

    private int stander;

    private Handler nextHandler;

    public Handler(int stander) {
        this.stander = stander;
    }

    public abstract void handler(MoneyRequest moneyRequest);

    public final void submit(MoneyRequest moneyRequest){
        int much = moneyRequest.getMuch();
        log.info("{},当前申请：{}元。", moneyRequest.getUser(), much);
        if(much >= this.stander){
            this.handler(moneyRequest);
            if(this.nextHandler != null){
                 this.nextHandler.submit(moneyRequest);
            }else {
                log.info("审批结束！！！！！！");
            }
        }
    }
}
