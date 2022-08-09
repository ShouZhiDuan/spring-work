package com.dsz.spring.design_mode.chain_model;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/8/9 17:09
 * @Description:
 */
@Slf4j
public class WifeHandler extends Handler {
    public WifeHandler() {
        super(500);
    }

    @Override
    public void handler(MoneyRequest moneyRequest) {
        log.info("老婆开始审批：{}", JSON.toJSONString(moneyRequest));
        log.info("老婆开始审批通过");
    }
}
