import com.SH.Service.ITeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        ITeacherService tS= (ITeacherService) applicationContext.getBean("teacherService");
            tS.ShowAll();




    }



}
