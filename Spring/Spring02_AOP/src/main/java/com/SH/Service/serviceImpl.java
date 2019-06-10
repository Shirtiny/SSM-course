package com.SH.Service;

import com.SH.Bean.Student;

public class serviceImpl implements Iservice{
    public void saveS() {
        Student student=new Student(1,"liming");
//        student=null;//将对象设置为null，产生异常
        System.out.println("kaishi保存"+student.getName());
    }

    public void deleteS(){
        Student student=new Student(1,"s");
//        student=null;
        System.out.println("执行删除"+student.getName());
    }

    public void updateS(){
        Student student=new Student(1,"学生名字");
//        student=null;
        System.out.println("更新,测试环绕"+student.getName());
    }
}
