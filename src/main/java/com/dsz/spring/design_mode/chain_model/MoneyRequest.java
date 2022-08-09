package com.dsz.spring.design_mode.chain_model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/8/9 16:16
 * @Description: 金额申请单
 */
@Data
@AllArgsConstructor
public class MoneyRequest {
    // 申请人
    private String user;
    // 申请金额
    private int much;
    // 申请原因
    private String content;
}
