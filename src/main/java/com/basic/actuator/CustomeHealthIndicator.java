package com.basic.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @author yanHeng
 * @date 2020-06-29 17:36
 * @description 自定义健康检测
 */
@Component
public class CustomeHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up()
                .withDetail("app","alive")
                .withDetail("author","yanheng");
    }
}
