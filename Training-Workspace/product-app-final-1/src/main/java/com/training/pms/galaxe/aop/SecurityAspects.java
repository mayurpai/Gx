package com.training.pms.galaxe.aop;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) // Is Used To Prioritize The Aspects
public class SecurityAspects {
    @Before(value = "execution(* com.training.pms.galaxe.service.ProductService.*(..))")
    public void doSecurityChecks() {
        System.out.println("Security Checks Performed Before Logging At: " + new Date());
    }

    @After(value = "execution(* com.training.pms.galaxe.service.ProductService.*(..))")
    public void doSecurityChecksAfter() {
        System.out.println("Security Checks Performed After Logging At: " + new Date());
    }
}
