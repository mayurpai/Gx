package com.training.pms.galaxe.aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// AOP: Aspect Oriented Programming
// Use Case: Cross Cutting Concerns (Spring Will Call It On Point Cut Expressions)
// Logging
// Security
// Transaction
//
// Point Cut Expression (*Product, *.com.service)
//
// @Before: Call Before The Method
// @After: Call After The Method
// @Around: Call Before And After The Method
// @Throws: Exception
//
// Use Case:   We Want To Do Logging For Service Implementation Without Calling It

@Component
@Aspect
@Order(0)
public class LoggingAspects {
    @Before(value = "execution(* com.training.pms.galaxe.service.ProductService.*(..))")
    public void doLogging() {
        System.out.println("Logged In At: " + new Date() + " By Aspects");
    }

    @After(value = "execution(* com.training.pms.galaxe.service.ProductService.*(..))")
    public void doLoggingAfter() {
        System.out.println("Do Some Work Called At: " + new Date() + " By Aspects");
    }

    // Decide Whether To Proceed With The Method Execution
    // By Default They Won't Proceed With The Method Execution
    // We Need To Use If-Else Or Try-Catch And Proceed
    @Around(value = "execution(* com.training.pms.galaxe.service.ProductService.*(..))")
    public Object doLoggingAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Logged In Before Around: " + new Date() + " By Aspects");
        Object valid = proceedingJoinPoint.proceed();
        System.out.println("Logged In After Around: " + new Date() + " By Aspects");
        return valid;
//     //    Here We Have Used The Return Type As Object As To Use * And Validate The ID For Product Insertion As The Value Shouldn't Always Be True And The Correct Object Is Returned After Checking
//     //    Return Type Should Match With The Method
//     //    If We Have Various Return Types, We Can't Make It Work Without Using Object
    }

}
