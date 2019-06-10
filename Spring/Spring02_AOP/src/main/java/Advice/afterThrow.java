package Advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class afterThrow implements ThrowsAdvice {
  public void afterthrow(){
      System.out.println("(schema形式的通知)异常通知");
  }
  public void afterThrowing(Method method, Object[] args, Object target, Throwable e){//注意Method的包是java反射的包
      System.out.println("异常通知");
  }
}
