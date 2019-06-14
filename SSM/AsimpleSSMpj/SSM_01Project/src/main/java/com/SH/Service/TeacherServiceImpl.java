package com.SH.Service;

import com.SH.Bean.Teacher;
import com.SH.Mapper.ITeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("teacherService")//注解方式注入，不需要写set方法，也不用在xml配置
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherMapper teacherMapper;
    @Override
    public List<Teacher> ShowAll() {
        List<Teacher> teachers = teacherMapper.SelectAll();
        return teachers;
    }

    @Override
    public void InsertOne(Teacher teacher) {
        teacherMapper.InsertOne(teacher);
    }

    @Override
    public void DeleteOne(int tid) {
        teacherMapper.DeleteOne(tid);
    }

    @Override
    public void UpdateOne(Teacher teacher) {
        teacherMapper.UpdateOne(teacher);
    }

    @Override
    public int SelectAllCount() {
        int teacherCount = teacherMapper.SelectAllCount();
        return teacherCount;
    }

    @Override
    public List<Teacher> SelectByPage(HashMap<String, Object> hashMap) {
        List<Teacher> teachers = teacherMapper.SelectByPage(hashMap);
        return teachers;
    }


}
