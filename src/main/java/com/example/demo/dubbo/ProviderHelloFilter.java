package com.example.demo.dubbo;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

@Activate(group = { Constants.PROVIDER })
public class ProviderHelloFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        System.out.println("-ProviderHelloFilter");
        return invoker.invoke(invocation);
    }
}
