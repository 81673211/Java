package com.fred.spi;

import java.util.ServiceLoader;

public class ServiceLoaderTest {

    public static void testLoad() {
        ServiceLoader<LogService> serviceLoader = ServiceLoader.load(LogService.class);
//        serviceLoader.iterator();
//
//        for (LogService logService : serviceLoader) {
//            System.out.println(logService.getClass());
//        }
        for (LogService logService : serviceLoader) {
            logService.log();
        }
    }

    public static void main(String[] args) {
        testLoad();
    }
}
