package com.basic.actuator;

/**
 * @author yanHeng
 * @date 2020-06-29 22:45
 * @description 测试
 */
public class SystemInfo implements  SystemInfoMBean {
    @Override
    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long totalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public void shutDown() {
        System.exit(0);
    }
}
