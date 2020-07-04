package com.example.demo;

import com.basic.actuator.SystemInfo;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * @author yanHeng
 * @date 2020-06-29 22:47
 * @description 调用jmx
 */
    public class JMXMain {

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, IOException {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.basic.actuator:type=SystemInfo");
        SystemInfo systemInfo = new SystemInfo();
        server.registerMBean(systemInfo,objectName);
        System.in.read();

    }
}
