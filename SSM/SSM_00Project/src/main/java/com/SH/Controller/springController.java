package com.SH.Controller;

import com.SH.Bean.Teacher;
import com.SH.Service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller//记得在springMVC中加入注解扫描
@RequestMapping(value = "springController")
public class springController {

    @Autowired//根据类型自动装填对象
//    @Qualifier("teacherService")//根据名字匹配对象，进行装填
    private TeacherServiceImpl teacherService;
    public void setTeacherService(TeacherServiceImpl teacherService) {//生成set方法，为spring提供注入途径
        this.teacherService = teacherService;
    }

    @RequestMapping(value = "showAll")
    public String showAll(Map<String,Object> map){
        List<Teacher> teachers = teacherService.ShowAll();
        map.put("teachers",teachers);
        return "OK";
    }

    @RequestMapping(value = "insertOne")
    public String insertOne(Teacher teacher,Map<String,Object> map){
        teacherService.IntertOne(teacher);
        List<Teacher> teachers = teacherService.ShowAll();
        map.put("teachers",teachers);
        return "OK";
    }

}
