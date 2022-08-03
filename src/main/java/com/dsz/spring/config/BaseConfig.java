package com.dsz.spring.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/5/19 14:06
 * @Description:
 */
@Data
public class BaseConfig {
    @Value("${name:testName}")
    public String name;
}
