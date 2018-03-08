package com.wz.netty.future.wz;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.wz.netty.future.wz.invoker.WZInvoker;

public interface ProxyFactory {


    <T> T getProxy(WZInvoker<T> invoker) throws RpcException;

    <T> WZInvoker<T> getInvoker(T proxy, Class<T> type) throws RpcException;

}