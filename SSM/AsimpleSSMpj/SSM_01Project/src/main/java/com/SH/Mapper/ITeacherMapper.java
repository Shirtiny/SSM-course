package com.SH.Mapper;

import com.SH.Bean.Teacher;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository("teacherMapper")//注解方式注入，不需要写set方法，也不用在xml配置
public interface ITeacherMapper {

     List<Teacher> SelectAll();
     void InsertOne(Teacher teacher);
     void DeleteOne(int tid);
     void UpdateOne(Teacher teacher);
     int   SelectAllCount();
    List<Teacher> SelectByPage(HashMap<String,Object> hashMap);
}
