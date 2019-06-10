package com.SH.Mapper;

import com.SH.Bean.student;

import java.util.List;

public interface IstudentMapper {

    student SelectOneStudent(int sId);
    List<student> SelectAllStudent();
    void InsertOneStudent(student student);
    void DeleteOneStudent(int sId);
    void UpdateOneStudent(student student);
    student SelectOneStudentWithTH(int sId);
    void DeleteOneStudentWithTH(int sId);
    List<student> SelectAllStudentWithTH();
    void InsertOneStudentWithTH(student student);
    void UpdateOneStudentWithTH(student student);
}
