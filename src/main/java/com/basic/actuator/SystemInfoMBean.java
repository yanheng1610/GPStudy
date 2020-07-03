package com.basic.actuator;

/**
 * @author yanHeng
 * @date 2020-06-29 22:40
 * @description 系统信息
 */
public interface SystemInfoMBean {

    int getCpuCore();
    long totalMemory();
    void shutDown();
}
