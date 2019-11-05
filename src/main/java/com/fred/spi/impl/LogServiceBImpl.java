package com.fred.spi.impl;

import com.fred.spi.LogService;

public class LogServiceBImpl implements LogService {
    @Override
    public void log() {
        System.out.println("log B");
    }
}
