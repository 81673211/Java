package com.fred.spi;

import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class ServiceLoaderTest {

    @Test
    public void testLoad() {
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
}
