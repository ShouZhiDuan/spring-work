package com.dsz.spring.dto;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/8/14 15:18
 * @Description:
 */
@Data
public class TestDTO {
    private String name;
    @JsonProperty("obj")
    private JSONObject obj;
}
