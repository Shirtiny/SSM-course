package Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class around implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    Object rs=null;
        try {
            System.out.println("环绕里的前置通知");
          rs=  methodInvocation.proceed();//执行对应切点的方法
            System.out.println("环绕里的后置通知");
        }catch (Exception e){
            System.out.println("环绕里的发出异常");
        }
        return rs;
    }
}
