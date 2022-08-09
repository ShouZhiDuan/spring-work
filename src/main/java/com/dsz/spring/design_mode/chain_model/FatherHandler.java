package com.dsz.spring.design_mode.chain_model;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/8/9 17:08
 * @Description:
 */
@Slf4j
public class FatherHandler extends Handler {

    public FatherHandler() {
        super(100);
    }

    @Override
    public void handler(MoneyRequest moneyRequest) {
        log.info("老爸开始审批：{}", JSON.toJSONString(moneyRequest));
        log.info("老爸开始审批通过");
    }
}
