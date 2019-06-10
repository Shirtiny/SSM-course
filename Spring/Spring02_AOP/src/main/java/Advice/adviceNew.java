package Advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("adviceN")
@Aspect//注解，此类是个通知
public class adviceNew {
    @Before("execution( public void com.SH.Service.serviceImpl.deleteS())")
   public void beforeA(){
       System.out.println("前置通知");
    }

    @AfterReturning(pointcut = "execution(public void com.SH.Service.serviceImpl.deleteS())",returning = "returnValue")
    public void afterA(JoinPoint jp, Object returnValue){//通过JoinPoint来获取函数的信息,returning获取返回值
        System.out.println("后置通知"+jp.getArgs().length+","+jp.getSignature().getName()+","+returnValue);
    }

    @AfterThrowing(pointcut = "execution(public void com.SH.Service.serviceImpl.deleteS())",throwing = "e")
    public void throwA(JoinPoint jp,NullPointerException e){
        System.out.println("异常通知"+e);
    }


    @After("execution(public void com.SH.Service.serviceImpl.deleteS())")
    public void finalA(){
        System.out.println("最终通知");
    }


    @Around( "execution(public void com.SH.Service.serviceImpl.updateS())")
    public void aroundA(ProceedingJoinPoint pj){
        System.out.println("执行前");
        try {

                pj.proceed();//执行
            System.out.println("执行后");
            } catch (Throwable throwable) {
            System.out.println("发生异常");

        }finally {
            System.out.println("最终执行");
        }
    }
}
