package com.fred.spi.impl;

import com.fred.spi.LogService;

public class LogServiceAImpl implements LogService {
    @Override
    public void log() {
        System.out.println("log A");
    }
}
