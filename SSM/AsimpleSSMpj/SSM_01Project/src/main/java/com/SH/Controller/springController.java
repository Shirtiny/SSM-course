package com.SH.Controller;


import com.SH.Bean.Teacher;
import com.SH.Service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
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
        return "AllTeachers";
    }

    @RequestMapping(value = "InsertOne")
    public void InsertOne(Teacher teacher, String path, HttpServletResponse response, HttpServletRequest request) throws IOException {
        teacherService.InsertOne(teacher);
        String contextPath = request.getContextPath();//获取容器名称? 见打印结果
        System.out.println(contextPath+";增加操作已完成");
        response.sendRedirect(contextPath+"/"+path);//字符串拼接，重定向到另一个链接"spController/ShowAll"
        //此时前端链接为spController/InsertOne?path=spController/ShowAll，传递了path的值
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
    public void DeletOneAuto(@PathVariable("tid") int tid ,Map<String,Object> map,String path,
                             HttpServletResponse response,HttpServletRequest request
    ) throws ServletException, IOException {//删除固定的某个id
        System.out.println("开始删除本行");//运行状况打印
        teacherService.DeleteOne(tid);
        List<Teacher> teachers = teacherService.ShowAll();
        map.put("teachers",teachers);
        System.out.println(path);
        response.sendRedirect(path);

        return ;

    }

    @RequestMapping(value = "UpdateJump/{tid}")//跳转到修改页面，保留tid
    public String UpdateJump(@PathVariable("tid") int tid,Map<String,Object> map,String path){
        map.put("tid",tid);
        map.put("path",path);
        System.out.println(path);
        return "change";
    }



    @RequestMapping(value = "UpadateOne/{tid}")
    public void UpdateOne(Teacher teacher,@PathVariable("tid") int tid,Map<String,Object> map,String path,
        HttpServletRequest request,HttpServletResponse response
    ) throws IOException {
        System.out.println("执行修改"+tid+","+teacher+";"+path);
        teacher.setTid(tid);
        teacherService.UpdateOne(teacher);
        List<Teacher> teachers = teacherService.ShowAll();
        map.put("teachers",teachers);
        response.sendRedirect(path);
        return ;
    }


//    @ModelAttribute//每次都先执行一次这个
//    public void SelectAllCount(Map<String,Object> map){
//
//        int teacherCount = teacherService.SelectAllCount();
//        map.put("teacherCount",teacherCount);
//
//    }

    @RequestMapping(value = "SelectByPage")//分页查询
    public String SelectByPage(Map<String,Object> map, HashMap<String,Object> hashMap,
                               @RequestParam(value = "pagenum",required = false,defaultValue = "1") int pagenum,
                               @RequestParam(value = "pagesize",required = false,defaultValue = "5") int pagesize){
                                //@RequestParam设置接收参数，设置值为非必要，设置默认值

        System.out.println("传入pagenum的值"+pagenum);//打印pagenum的值，观察变化

        pagenum=(pagenum-1)*pagesize;//将输入的页数换算成，数据库要查询的第几页
        hashMap.put("pagenum",pagenum);
        hashMap.put("pagesize",pagesize);//将页码和页面大小值传入数据库
        List<Teacher> teachersPage = teacherService.SelectByPage(hashMap);//执行分页查询

        System.out.println("数据库查询pagenum的值"+pagenum);//打印pagenum的值，观察变化

        map.put("teachersPage",teachersPage);//将分页查询结果放入request
        pagenum=(pagenum/pagesize)+1;//将数据库页码值转换成前端页码值
        int teacherCount = teacherService.SelectAllCount();//查询teacher总个数
        int pageCount;//定义总页数
        if (teacherCount%pagesize==0){//判断总页数是否为整数
            pageCount=teacherCount/pagesize;
        }else {
            pageCount=(teacherCount/pagesize)+1;
        }

        map.put("pagenum",pagenum);//将页码放入request
        map.put("pagesize",pagesize);
        map.put("pageCount",pageCount);
        map.put("teacherCount",teacherCount);

        System.out.println("传出pagenum的值"+pagenum);//打印pagenum的值，观察变化

        return "TeacherManager";

    }

}
