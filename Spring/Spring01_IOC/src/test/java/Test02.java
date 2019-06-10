import com.SH.Bean.Users;
import com.SH.Service.Iservice;
import com.SH.Service.ServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

    public static void addUsers(int id, Users user){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Iservice service =(Iservice) context.getBean("service");
        boolean b = service.QueryAndaddUsers(id, user);
        System.out.println(b);
    }

    public static void main(String[] args) {

   Users user=new Users("sds","s",1,"sd");
            addUsers(0,user);

    }



}
