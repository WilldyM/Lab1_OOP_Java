package com.donnu.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.donnu.demo.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyConfig {
}
