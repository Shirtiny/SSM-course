package com.SH.Controller;


import com.SH.Bean.Teacher;
import com.SH.Service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "spController")
public class springController {

    //   @Qualifier("teacherService")//这样按名字没有成功注入，不知道为什么
    @Autowired
    private ITeacherService teacherService;

    @RequestMapping(value = "ShowAll")
    public String ShowAll(Map<String,Object> map){
        List<Teacher> teachers = teacherService.ShowAll();
        map.put("teachers",teachers);
        return "OK";
    }

    @RequestMapping(value = "InsertOne")
    public void InsertOne(Teacher teacher, HttpServletResponse response, HttpServletRequest request) throws IOException {
        teacherService.InsertOne(teacher);
        String contextPath = request.getContextPath();//获取容器名称? 见打印结果
        System.out.println(contextPath+";增加操作已完成");
        response.sendRedirect(contextPath+"/spController/ShowAll");//字符串拼接，重定向到另一个链接
        return ;
    }

    @RequestMapping(value = "DeleteOne")
    public String DeleteOne( int tid, HttpServletRequest request, HttpServletResponse response) throws IOException {
        teacherService.DeleteOne(tid);
//        String contextPath = request.getContextPath();
//        response.sendRedirect(contextPath+"/spController/ShowAll");
        return "redirect:/spController/ShowAll";//重定向方式跳转页面
    }

    //在index里成功，在管理页面失败404,链接前加${pageContext.request.contextPath}成功，这个是el表达式，值为容器名
    @RequestMapping(value = "DeleteOneAuto/{tid}")
    public String DeletOneAuto(@PathVariable("tid") int tid ,Map<String,Object> map){//删除固定的某个id
        System.out.println("开始删除本行");//运行状况打印
        teacherService.DeleteOne(tid);
        List<Teacher> teachers = teacherService.ShowAll();
        map.put("teachers",teachers);
        return "OK";

    }

    @RequestMapping(value = "UpdateJump/{tid}")//跳转到修改页面，保留tid
    public String UpdateJump(@PathVariable("tid") int tid,Map<String,Object> map){
        map.put("tid",tid);
        return "change";
    }



    @RequestMapping(value = "UpadateOne/{tid}")
    public String UpdateOne(Teacher teacher,@PathVariable("tid") int tid,Map<String,Object> map){
        System.out.println("执行修改"+tid+","+teacher);
        teacher.setTid(tid);
        teacherService.UpdateOne(teacher);
        List<Teacher> teachers = teacherService.ShowAll();
        map.put("teachers",teachers);
        return "OK";
    }


}
