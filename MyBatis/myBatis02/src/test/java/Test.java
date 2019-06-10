import com.SH.Bean.student;
import com.SH.Mapper.IstudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test {
//    public static  void  SelectOneStudent() throws IOException {//查询某一个学生
//
//        Reader reader = Resources.getResourceAsReader("conf.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sessionFactory.openSession();
//        IstudentMapper mapper = session.getMapper(IstudentMapper.class);
//        int sid=1;
//        student student = mapper.SelectOneStudent(sid);//sid=1
//        System.out.println("查询一个学生：id="+sid);
//        System.out.println(student);
//        session.close();
//    }
//
//    public static void SelectAllStudent() throws IOException {//查询全部学生
//        Reader reader = Resources.getResourceAsReader("conf.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sessionFactory.openSession();
//        IstudentMapper mapper = session.getMapper(IstudentMapper.class);
//        List<student> students = mapper.SelectAllStudent();
//        System.out.println("查询全部的学生：");
//        System.out.println(students);
//        session.close();
//    }
//
//    public static void InsertOneStudent() throws IOException {//插入一个学生
//        Reader reader = Resources.getResourceAsReader("conf.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sessionFactory.openSession();
//        IstudentMapper mapper = session.getMapper(IstudentMapper.class);
//       student student=new student(0,"sd",21,"sd");//设置插入的学生属性
//        mapper.InsertOneStudent(student);
//        session.commit();//别忘了增删改要手动commit
//        System.out.println("插入一个学生：id="+student.getsId());
//        session.close();
//    }
//
//    public static void DeleteOneStudent() throws IOException {
//        Reader reader = Resources.getResourceAsReader("conf.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sessionFactory.openSession();
//        IstudentMapper mapper = session.getMapper(IstudentMapper.class);
//        int sid=0;
//        mapper.DeleteOneStudent(sid);//设置id
//        session.commit();
//        System.out.println("删除一个学生：id="+sid);
//        session.close();
//
//    }
//
//    public static void UpdateOneStudent() throws IOException {
//        Reader reader = Resources.getResourceAsReader("conf.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sessionFactory.openSession();
//        IstudentMapper mapper = session.getMapper(IstudentMapper.class);
//        student student=new student("马钧虎",20,"蚌埠学院");
//        student.setsId(0);
//        mapper.UpdateOneStudent(student);
//        session.commit();
//        System.out.println("修改id："+student.getsId()+"成为");
//        session.close();
//    }

//    public static SqlSession getSession() throws IOException {//工具，获得session
//        Reader reader = Resources.getResourceAsReader("conf.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sessionFactory.openSession();
//        return session;
//    }
//
//    public static IstudentMapper getStudentMapper() throws IOException {//工具，获得mapper
//        SqlSession session = getSession();
//        IstudentMapper mapper = session.getMapper(IstudentMapper.class);
//        return mapper;
//    }



    public static  void  SelectOneStudentWithTH(int id) throws IOException {//查询某一个学生

        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IstudentMapper mapper = session.getMapper(IstudentMapper.class);

        student student = mapper.SelectOneStudentWithTH(id);//sid=0
        System.out.println("查询一个学生：id="+id);
        System.out.println(student);
        session.close();
    }

    public static void DeleteOneStudentWithTH(int id) throws IOException {

        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IstudentMapper mapper = session.getMapper(IstudentMapper.class);

        mapper.DeleteOneStudentWithTH(id);
        session.commit();
        System.out.println("删除id为："+id+"的学生");
        session.close();
    }
public static void SelectAllStudentWithTH() throws IOException {
    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IstudentMapper mapper = session.getMapper(IstudentMapper.class);
    List<student> students = mapper.SelectAllStudentWithTH();
    System.out.println(students);
    session.close();
}

public  static void InsertOneStudentWithTH(student st) throws IOException {
    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IstudentMapper mapper = session.getMapper(IstudentMapper.class);
    mapper.InsertOneStudentWithTH(st);
    session.commit();
    System.out.println("增加id为："+st.getsId()+"的学生");
    session.close();
}

public static void UpdateOneStudentwithTH(student st) throws IOException {
    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IstudentMapper mapper = session.getMapper(IstudentMapper.class);
    mapper.UpdateOneStudentWithTH(st);
    session.commit();
    System.out.println("修改id为:"+st.getsId()+"的学生");
    session.close();

}

    public static void main(String[] args) throws IOException {
//        SelectOneStudent();
//
//        DeleteOneStudent();
//        SelectAllStudent();
//
//        InsertOneStudent();
//        SelectAllStudent();
//
//        UpdateOneStudent();
//        SelectAllStudent();


      SelectOneStudentWithTH(0);

      DeleteOneStudentWithTH(0);
      SelectAllStudentWithTH();

      student st_1=new student(0,"马钧虎233",21,"蚌埠学院",true);
      InsertOneStudentWithTH(st_1);
      SelectAllStudentWithTH();


      student st2=new student("马钧虎",21,"百变小樱",true);
      st2.setsId(0);
      UpdateOneStudentwithTH(st2);
      SelectAllStudentWithTH();
    }
}
