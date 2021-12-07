package com.donnu.demo.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(public void addItem(..))")
    public void addItemMethod(){}
}
