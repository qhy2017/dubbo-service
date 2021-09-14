package com.example.demo.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

public class RPCTool {

    private ApplicationConfig applicationConfig;

    private RegistryConfig registryConfig;

    private ReferenceConfig referenceConfig;

    public static RPCTool  build() {
        return new RPCTool();
    }
    public RPCTool() {
        this.referenceConfig = new ReferenceConfig();
    }

    public <T> T getImpl(Class<T> c) {
        this.referenceConfig.setInterface(c);
        return (T) this.referenceConfig.get();
    }

    public RPCTool setApplicationConfig(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.referenceConfig.setApplication(applicationConfig);
        return this;
    }

    public RPCTool setRegistryConfig(RegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        this.referenceConfig.setRegistry(registryConfig);
        return this;
    }

    public RPCTool setTimeout(Integer timeout) {
        this.referenceConfig.setTimeout(timeout);
        return this;
    }
    public RPCTool setCheck(boolean check) {
        this.referenceConfig.setCheck(check);
        return this;
    }
    public RPCTool setCheck(Class c) {
        this.referenceConfig.setInterface(c);
        return this;
    }

    public RPCTool setVersion(String version) {
        this.referenceConfig.setVersion(version);
        return this;
    }



}
