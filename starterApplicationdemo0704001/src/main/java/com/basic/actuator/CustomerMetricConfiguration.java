package com.basic.actuator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanHeng
 * @date 2020-06-29 21:53
 * @description 自定义端点配置类
 */
@Configuration
public class CustomerMetricConfiguration {

    @Bean
    public CustomerMetricsIndicator  getCustomerMetrics(){
        return new CustomerMetricsIndicator();
    }
}
