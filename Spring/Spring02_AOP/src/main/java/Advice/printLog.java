package Advice;


import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class printLog implements MethodBeforeAdvice {

public  void printL(){//没有实现接口
    System.out.println("(schema形式的通知)的前置通知");
}
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }
}
