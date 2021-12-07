package com.donnu.demo.aop.aspects;

import com.donnu.demo.aop.Car;
import com.donnu.demo.aop.Furniture;
import com.donnu.demo.aop.InterfaceItem;
import com.donnu.demo.aop.Toy;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class TestAspect {
//    @Before("com.donnu.demo.aop.aspects.MyPointCuts.addItemMethod()")
//    public void beforeAddItemLoggingAdvice() {
//        System.out.println("beforeAddItemLoggingAdvice worked");
//    }
//
//    @AfterReturning("com.donnu.demo.aop.aspects.MyPointCuts.addItemMethod()")
//    public void AfterReturningAddItemLoggingAdvice() {
//        System.out.println("AfterReturningAddItemLoggingAdvice worked");
//    }
//
//    @AfterThrowing("com.donnu.demo.aop.aspects.MyPointCuts.addItemMethod()")
//    public void AfterThrowingSetNameLoggingAdvice() {
//        System.out.println("AfterThrowingSetNameLoggingAdvice worked");
//    }
//
//    @After("com.donnu.demo.aop.aspects.MyPointCuts.addItemMethod()")
//    public void AfterAddItemLoggingAdvice() {
//        System.out.println("AfterAddItemLoggingAdvice worked");
//    }

//    @Around("com.donnu.demo.aop.aspects.MyPointCuts.addItemMethod()")
//    public Object AroundAddItemLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("AroundAddItemLoggingAdvice: Пытаемся добавить вещь на склад");
//
//        Object targetMethodResult = proceedingJoinPoint.proceed();
//
//        System.out.println("AroundAddItemLoggingAdvice: Добавили вещь на склад");
//
//        return targetMethodResult;
//    }

    //---------------------------------------
    @Before("execution(public * get*(..))")
    public void BeforeGetItemTestAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] arguments = joinPoint.getArgs();
        for (Object obj:arguments) {
            if (obj instanceof String) {
                obj = "Mr." + obj.toString();
                System.out.println(obj + " пытается получить со склада вещь при помощи метода " +
                        methodSignature.getName());
            }
        }
    }

    @AfterReturning(pointcut = "execution(* get*(..))",
                    returning = "items")
    public void AfterReturningGetToysTestAdvice(List<Toy> items) {
        System.out.println("Следующие вещи были получены:");
        for (Toy toy:items) {
            System.out.println(toy.getName());
        }
    }

    @AfterReturning(pointcut = "execution(* get*(..))",
                    returning = "items")
    public void AfterReturningGetCarsTestAdvice(List<Car> items) {
        System.out.println("Следующие вещи были получены:");
        for (Car toy:items) {
            System.out.println(toy.getName());
        }
    }

    @AfterReturning(pointcut = "execution(* get*(..))",
                    returning = "items")
    public void AfterReturningGetFurnituresTestAdvice(List<Furniture> items) {
        System.out.println("Следующие вещи были получены:");
        for (Furniture toy:items) {
            System.out.println(toy.getName());
        }
    }

}
