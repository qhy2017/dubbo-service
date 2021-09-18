package com.example.demo.service.impl;

import com.example.demo.service.ITestImpl;

public class TestImpl implements ITestImpl {
    @Override
    public String getHello(String msg) {
        return msg;
    }
}
