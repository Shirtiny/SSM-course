package com.SH.Test;

import com.SH.Bean.person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test {
    public static void Insert() throws IOException {


          Reader  reader = Resources.getResourceAsReader("conf.xml");



        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session =sessionFactory.openSession();
         person person=new person(99,"sd",34);

         String statement="com.SH.Bean.personMapper.insertPerson";

        session.insert(statement,person);
            session.commit();

        System.out.println("增加"+person+"成功");
        session.close();

    }

  public static void  delete() throws IOException {
      Reader reader = Resources.getResourceAsReader("conf.xml");
      SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
      SqlSession session = sessionFactory.openSession();
      String stmt="com.SH.Bean.personMapper.deletePerson";
      int count=session.delete(stmt,99);
      session.commit();
    System.out.println("删除"+count+"个成功");
      session.close();

  }

  public static  void  update() throws IOException {
      Reader reader = Resources.getResourceAsReader("conf.xml");
      SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
      SqlSession session = sessionFactory.openSession();
        person person=new person(1,"SH",230);
        String stmt="com.SH.Bean.personMapper.updatePerson";
        session.update(stmt,person);
        session.commit();
        session.close();

  }


  public  static  void  showOne() throws IOException {
      Reader reader= Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
      SqlSession session = sessionFactory.openSession();
           String stmt="com.SH.Bean.personMapper.queryPersonById";
        person person  = session.selectOne(stmt,1);

             session.commit();
             System.out.println(person);
            session.close();

  }



    public static void showAll() throws IOException {


        Reader   reader = Resources.getResourceAsReader("conf.xml");



        SqlSessionFactory     sessionFactory = new SqlSessionFactoryBuilder().build(reader);



        SqlSession session= sessionFactory.openSession();
        String stmt="com.SH.Bean.personMapper.showAll";
        List<person> personList=session.selectList(stmt);
        System.out.println(personList+"\n");
        session.close();
    }

    public static void main(String[] args) throws IOException {
        //Insert();
       //delete();
       // update();
        //showOne();
        showAll();
    }
}
