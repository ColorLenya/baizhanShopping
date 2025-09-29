package com.itbaizhan;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient //向注册中心注册该服务
@EnableDubbo // 开启Dubbo
@RefreshScope // 配置动态刷新
@SpringBootApplication
@MapperScan("com.itbaizhan.mapper")
public class ShoppingGoodsServiceApplication
{
    public static void main( String[] args )
    {

        SpringApplication.run(ShoppingGoodsServiceApplication.class, args);
    }
}
