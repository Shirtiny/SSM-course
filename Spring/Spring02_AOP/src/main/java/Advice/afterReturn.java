package Advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class afterReturn implements AfterReturningAdvice {


    public void afterReturn() throws Throwable {//没有用接口里的方法
        System.out.println("(schema形式的通知)的后置通知");
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知");
    }
}
