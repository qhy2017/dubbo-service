package com.example.demo.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.example.demo.service.IUserService;

public class Test {
    public static void main(String[] args) {
//        test();//执行测试
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("abc");
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://www.qhy.com:2181");//zookeeper注册中心地址
        registryConfig.setProtocol("dubbo");//协议
        RPCTool rpcTool = RPCTool.build()
                .setApplicationConfig(applicationConfig)
                .setRegistryConfig(registryConfig).setCheck(false).setTimeout(5000).setVersion("1.0.0");
        IUserService impl = rpcTool.getImpl(IUserService.class);
        System.out.println(impl.getUserName("quHongyuan"));
         impl = rpcTool.getImpl(IUserService.class);
        System.out.println(impl.getUserName("quHongyuan"));
    }

}
