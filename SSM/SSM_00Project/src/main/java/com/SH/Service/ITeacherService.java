package com.SH.Service;

import com.SH.Bean.Teacher;

import java.util.List;

public interface ITeacherService {

    List<Teacher> ShowAll();
    void IntertOne(Teacher teacher);
}
