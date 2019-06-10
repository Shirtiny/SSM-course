import com.SH.Bean.Users;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    public static void UsersSet(){//set方式注入值
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object usersSet = context.getBean("UsersSet");
        System.out.println(usersSet);
    }

    public static void UsersContruct(){//构造器方式注入值
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object usersContruct = context.getBean("UsersContruct");
        System.out.println(usersContruct);
    }

public static void UsersP(){//namespace,p方式注入值
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Object usersP = context.getBean("UsersP");
    System.out.println(usersP);
}



public static void StudentsList(){//一些集合类型的注入
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Object studentsList = context.getBean("StudentsList");
    System.out.println(studentsList);
}


    public static void main(String[] args) {
//
        UsersSet();
//        UsersContruct();
//        UsersP();
//    StudentsList();


    }
}
