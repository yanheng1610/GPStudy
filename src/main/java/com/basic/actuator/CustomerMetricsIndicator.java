package com.basic.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yanHeng
 * @date 2020-06-29 21:47
 * @description 自定义端点
 */
@Endpoint(id="customer")
public class CustomerMetricsIndicator {

    @ReadOperation
    public Map<String,Object> time(){
        Map<String,Object> map = new HashMap<>();
        Date date = new Date();
        map.put("系统当前时间",date.toString());
        return map;
    }
}