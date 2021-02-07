package com.zhss.demo.dubbo.nacos;

import com.zhss.demo.dubbo.nacos.api.ServiceA;
// dubbo的service 不是spring的service
import org.apache.dubbo.config.annotation.Service;

@Service(
        version = "1.0.0",
        // 接口类型
        interfaceClass = ServiceA.class,
        // 集群故障转移策略
        cluster = "failfast",
        // 负载均衡算法
        loadbalance = "roundrobin"
)
/**
 *@Description
 *@CreateDate 2021\2\7 0007 10:33
 *@Author z
 *@Version 1.0
 */
public class ServiceAImpl implements ServiceA {

    @Override
    public String greet(String name) {
        return "hello, " + name;
    }
}
