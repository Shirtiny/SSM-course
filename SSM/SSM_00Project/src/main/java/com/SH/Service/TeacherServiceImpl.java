package com.SH.Service;

import com.SH.Bean.Teacher;
import com.SH.Mapper.ITeacherMapper;


import java.util.List;

public class TeacherServiceImpl implements ITeacherService{

private ITeacherMapper iTeacherMapper;//定义mapper(dao层)属性

    public void setiTeacherMapper(ITeacherMapper iTeacherMapper) {//生成set方法，用于spring将对象注入
        this.iTeacherMapper = iTeacherMapper;
    }

    public List<Teacher> ShowAll() {
        return iTeacherMapper.SelectAll();
    }

    public void IntertOne(Teacher teacher) {
        iTeacherMapper.InsertOne(teacher);
    }
}
