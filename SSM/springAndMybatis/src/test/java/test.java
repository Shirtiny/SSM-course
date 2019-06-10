import com.SH.Mapper.ITeacherMapper;
import com.SH.Bean.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    public static void selectAll(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ITeacherMapper firstmapper = (ITeacherMapper) context.getBean("firstmapper");

        List<Teacher> teachers = firstmapper.SelectAll();
        System.out.println(teachers);
    }

    public static void main(String[] args) {
        selectAll();
    }
}
