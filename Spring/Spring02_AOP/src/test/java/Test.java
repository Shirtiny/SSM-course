import com.SH.Service.Iservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void testAdvice(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Iservice service = (Iservice)context.getBean("service");
//        service.saveS();
//        service.deleteS();
        service.updateS();
        }

    public static void main(String[] args) {
        testAdvice();







    }

}
